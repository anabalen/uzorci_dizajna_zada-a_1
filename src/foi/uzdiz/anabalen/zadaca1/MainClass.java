package foi.uzdiz.anabalen.zadaca1;

import foi.uzdiz.anabalen.zadaca1.singleton.Natjecanje;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.FotoaparatFactory;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Ana-Marija
 */
public class MainClass {

    public static void main(String[] args) throws Exception {

        //inicijalizacija varijabli
        int sjeme = Integer.parseInt(args[0]);
        int maxBrTema = Integer.parseInt(args[1]);
        int maxBrTemaNatjecatelj = Integer.parseInt(args[2]);
        int maxBrKategorija = Integer.parseInt(args[3]);
        int maxBrNatjecatelja = Integer.parseInt(args[4]);
        int brClanovaZirija = Integer.parseInt(args[5]);
        String klasaBodova = args[6];
        String datoteka = args[7];

        int brTema;
        int brKategorija;
        int brNatjecatelja;
        int brTemaPoNatjecatelju;

        Random rand = new Random(sjeme);
        Random slucajniBroj = new Random();

        //random generiranje broja tema, kateorija...
        brTema = rand.nextInt(maxBrTema - 1) + 1;
        brKategorija = rand.nextInt((maxBrKategorija) - 1) + 1;

        if (brTema > maxBrTemaNatjecatelj) {
            brTemaPoNatjecatelju = rand.nextInt(maxBrTemaNatjecatelj - 1) + 1;
        } else {
            brTemaPoNatjecatelju = rand.nextInt((brTema + 1) - 1) + 1;
        }

        brNatjecatelja = rand.nextInt(maxBrNatjecatelja - 0) + 0;

        //ispis izgeneriranih brojeva
        System.out.println("Broj tema: " + brTema);
        System.out.println("Broj kategorija: " + brKategorija);
        System.out.println("Broj tema po natjecatelju: " + brTemaPoNatjecatelju);
        System.out.println("Broj natjecatelja: " + brNatjecatelja);
        System.out.println("");

        String[] listaTema = listaTema();
        String[] kategorijeFotoaparata = kategorijaFotoaparata(3);

        int brojTemaNatjecatelja;
        String[] temeZaNatjecatelja;

        int i;

        //kreiranje prijave unutar singletona natjecanje
        Natjecanje singleton = Natjecanje.getInstance();
        Prijava prijava = singleton.init();

        // kreiranje objekta za ispis u vanjsku datoteku
        FileWriter fileWriter = new FileWriter(datoteka);
        fileWriter.write("Popis svih prijava natjecanja: \n");

        for (i = 0; i < brNatjecatelja; i++) {

            //generiranje broja tema po svakom natjecatelju
            brojTemaNatjecatelja = slucajniBroj.nextInt((brTema) - 1) + 1;
            temeZaNatjecatelja = new String[brojTemaNatjecatelja];

            Set<Integer> indexiNatjecatelja = getIndexes(brojTemaNatjecatelja, brTema);
            String[] noveTemeNatjecatelja = randomIzListe(indexiNatjecatelja, brojTemaNatjecatelja, listaTema);

            Set<Integer> indexiKategorijaFotoaparata = getIndexes(brKategorija + 1, 3);
            String[] noveKategorijeFotoaparata = randomIzListe(indexiKategorijaFotoaparata, brKategorija, kategorijeFotoaparata);

            Map<String, String[]> aMap = new HashMap<>();
            aMap.size();
            aMap.put("tema", noveTemeNatjecatelja);

            for (int y = 0; y < noveTemeNatjecatelja.length; y++) {

                aMap.get(y);

                for (int j = 0; j < noveKategorijeFotoaparata.length; j++) {
                    String kategorijaPrijave = noveKategorijeFotoaparata[j];

                    int korektnost = slucajniBroj.nextInt(21 - 0) + 0;
                    String diskvalifikacija = "";
                    if (korektnost < 2) {
                        diskvalifikacija = "diskvalificiran";
                    }

                    switch (noveKategorijeFotoaparata[j]) {
                        case "DSLR":
                            break;
                        case "DSLM":
                            break;
                        case "Compact":
                            break;
                    }

                    //kreiranje objekata za prijavu
                    Fotoaparat fotoaparat = FotoaparatFactory.getFotoaparat(kreirajKonkretniFactory(kategorijaPrijave));
                    Fotografija fotografija = new Fotografija();
                    Natjecatelj natjecatelj = new Natjecatelj(i + 1);
                    Tema tema = new Tema(noveTemeNatjecatelja[y]);
                    Kategorija kategorija = new Kategorija(noveKategorijeFotoaparata[j]);

                    //kreiranje prijave
                    prijava = new Prijava(natjecatelj, tema, kategorija, fotoaparat, fotografija, korektnost);

                    //ispis svih prijavljenih
                    System.out.println(natjecatelj.getRbrNatjecatelja() + "  " + tema.getNaziv() + "   " + kategorija.getNaziv() + " " + fotoaparat.getNaziv() + "  " + fotoaparat.getObjektiv()
                            + " " + "fotka: blenda - " + fotografija.getBlenda() + ", ekspozicija - " + fotografija.getEkspozicija() + " " + prijava.getKorektnost() + "  " + diskvalifikacija);

                    System.out.println("");

                    //upis u datoteku
                    fileWriter.write(natjecatelj.getRbrNatjecatelja() + "  " + " | " + tema.getNaziv() + "   " + " | " + kategorija.getNaziv() + " " + " | " + fotoaparat.getNaziv() + "  " + " | " + fotoaparat.getObjektiv()
                            + " " + " | " + "fotka: blenda - " + fotografija.getBlenda() + ", ekspozicija - " + fotografija.getEkspozicija() + " " + " | " + prijava.getKorektnost() + "\n");

                }
            }
        }
        //zatvaranje datoteke za upis
        fileWriter.close();

    }

    /**
     * Dobivanje indexa za teme
     *
     * @param velicina
     * @param broj
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
        Random rng = new Random();
        int x = 0;
        for (Integer index : indexi) {
            if (x > brTema - 1) {
                break;
            } else {
                noveTeme[x] = listaTema[index];
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

    private static AbstractFactory kreirajKonkretniFactory(String kategorijaFotoaparata) {

        switch (kategorijaFotoaparata) {
            case "DSLM":
                return new DSLMFactory();
            case "DSLR":
                return new DSLRFactory();
            default:
                return new CompactFactory();
        }
    }
}
