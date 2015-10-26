package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.models.Natjecanje;
import foi.uzdiz.anabalen.abstractfactory.models.Teme;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;
import foi.uzdiz.anabalen.abstractfactory.models.Natjecatelj;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ana-Marija
 */
public class MainClass {

    public static void main(String[] args) {

        //inicijalizacija varijabli
        int sjeme = Integer.parseInt(args[0]);
        int maxBrTema = Integer.parseInt(args[1]);
        int maxBrTemaNatjecatelj = Integer.parseInt(args[2]);
        int maxBrKategorija = Integer.parseInt(args[3]);
        int maxBrNatjecatelja = Integer.parseInt(args[4]);
        /**
         * int brClanovaZirija = Integer.parseInt(args[5]); String klasaBodova =
         * args[6]; String datoteka = args[7];
         *
         */
        int brTema;
        int brKategorija;
        int brNatjecatelja;
        int brTemaPoNatjecatelju;
        Random rand = new Random(sjeme);
        //random generiranje broja tema, kateorija...
        brTema = rand.nextInt(maxBrTema - 1) + 1;
        brKategorija = rand.nextInt(maxBrKategorija - 1) + 1;
        brTemaPoNatjecatelju = rand.nextInt(maxBrTemaNatjecatelj - 1) + 1;
        brNatjecatelja = rand.nextInt(maxBrNatjecatelja - 0) + 0;

        System.out.println(brTema);
        System.out.println(brKategorija);
        System.out.println(brTemaPoNatjecatelju);
        System.out.println(brNatjecatelja);

        Natjecanje natjecaj = Natjecanje.getInstance();
        // System.out.println(natjecaj + "objekt");
        Teme tema = new Teme();
        String[] listaTema = listaTema();

        Set<Integer> indexi = getIndexes(brTema, listaTema.length - 1);
        String[] noveTeme = randomIzListe(indexi, brTema, listaTema);
        String[] kategorijeFotoaparata = kategorijaFotoaparata(3);

        Random slucajnaTema = new Random();
        int brojTemaNatjecatelja;
        int brojTeme;
        String[] temeZaNatjecatelja;

        for (int i = 0; i < brNatjecatelja; i++) {
            Natjecatelj natjecatelj = new Natjecatelj();
            brojTemaNatjecatelja = slucajnaTema.nextInt((brTema + 1) - 1) + 1;
            temeZaNatjecatelja = new String[brojTemaNatjecatelja];

            Set<Integer> indexiNatjecatelja = getIndexes(brojTemaNatjecatelja, brTema);
            String[] noveTemeNatjecatelja = randomIzListe(indexiNatjecatelja, brojTemaNatjecatelja, listaTema);

            Set<Integer> indexiKategorijaFotoaparata = getIndexes(brKategorija + 1, 3);
            String[] noveKategorijeFotoaparata = randomIzListe(indexiKategorijaFotoaparata, brKategorija + 1, kategorijeFotoaparata);

            
            
            
            int j;
            String[][] nTeme = new String[noveTemeNatjecatelja.length][noveKategorijeFotoaparata.length];
            for (int y = 0; y < noveTemeNatjecatelja.length; y++) {
                for (j = 0; j < noveKategorijeFotoaparata.length; j++) {
                    nTeme[y][j] = noveTemeNatjecatelja[y] + "  " + noveKategorijeFotoaparata[j];
                    System.out.println(nTeme[y][j]);
                }
            }

            natjecatelj.setNatjecatelj(i + 1);
            natjecatelj.setTema(noveTemeNatjecatelja);
            natjecatelj.setKategorijaFotoaparata(noveKategorijeFotoaparata);

            System.out.println(natjecatelj.getNatjecatelj());
            System.out.println(indexiKategorijaFotoaparata);
            System.out.println(Arrays.toString(natjecatelj.getKategorijaFotoaparata()));
            System.out.println(Arrays.toString(natjecatelj.getTema()));

        }
    }

    /**
     * Dobivanje indexa za teme
     *
     * @param velicina
     * @return
     */
    public static Set<Integer> getIndexes(int velicina, int broj) {
        Set<Integer> indexi = new LinkedHashSet<>();
        Random rng = new Random();

        while (indexi.size() < velicina) {
            Integer next = rng.nextInt(broj - 0) + 0;
            indexi.add(next);
        }

        return indexi;
    }

    /**
     * lista tema prema odabranim random indexima
     *
     * @param indexi
     * @param brTema
     * @param listaTema
     * @return
     */
    public static String[] randomIzListe(Set<Integer> indexi, int brTema, String[] listaTema) {
        String[] noveTeme = new String[brTema];
        int x = 0;
        for (Integer index : indexi) {
            if (x > brTema - 1) {
                break;
            } else {
                noveTeme[x] = listaTema[index];
                //System.out.println(noveTeme[x]+" "+ x); 
                x++;
            }
        }
        return noveTeme;
    }

    /**
     *
     * @return
     */
    public static String[] listaTema() {
        String[] listaTema = new String[10];
        listaTema[0] = "portret";
        listaTema[1] = "priroda";
        listaTema[2] = "makro";
        listaTema[3] = "sport";
        listaTema[4] = "montaža";
        listaTema[5] = "čovjek";
        listaTema[6] = "grad";
        listaTema[7] = "ljubav";
        listaTema[8] = "djeca";
        listaTema[9] = "zdravlje";

        return listaTema;
    }

    /**
     *
     * @param brKategorija
     * @return
     */
    public static String[] kategorijaFotoaparata(int brKategorija) {
        String[] kategorijaFotoaparata = new String[3];
        kategorijaFotoaparata[0] = "DSLR";
        kategorijaFotoaparata[1] = "DSLM";
        kategorijaFotoaparata[2] = "Compact";
        return kategorijaFotoaparata;
    }
}
