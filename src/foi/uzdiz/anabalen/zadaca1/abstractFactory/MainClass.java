package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import static com.sun.org.apache.regexp.internal.RETest.test;
import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;
import foi.uzdiz.anabalen.abstractfactory.models.Fotoaparat;
import foi.uzdiz.anabalen.abstractfactory.models.Kategorija;
import foi.uzdiz.anabalen.abstractfactory.models.Natjecanje;
import foi.uzdiz.anabalen.abstractfactory.models.Teme;
import foi.uzdiz.anabalen.abstractfactory.models.Natjecatelj;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
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
        Kategorija kategorija = new Kategorija();
        String[] listaTema = listaTema();
        
        Set<Integer> indexi = getIndexes(brTema, listaTema.length - 1);
        String[] noveTeme = randomIzListe(indexi, brTema, listaTema);
        String[] kategorijeFotoaparata = kategorijaFotoaparata(3);

        Random slucajnaTema = new Random();
        int brojTemaNatjecatelja;
        int brojTeme;
        String[] temeZaNatjecatelja;

        for (int i = 0; i < brNatjecatelja; i++) {
            
            brojTemaNatjecatelja = slucajnaTema.nextInt((brTema + 1) - 1) + 1;
            temeZaNatjecatelja = new String[brojTemaNatjecatelja];

            Set<Integer> indexiNatjecatelja = getIndexes(brojTemaNatjecatelja, brTema);
            String[] noveTemeNatjecatelja = randomIzListe(indexiNatjecatelja, brojTemaNatjecatelja, listaTema);

            Set<Integer> indexiKategorijaFotoaparata = getIndexes(brKategorija + 1, 3);
            String[] noveKategorijeFotoaparata = randomIzListe(indexiKategorijaFotoaparata, brKategorija + 1, kategorijeFotoaparata);

            Set<Integer> indexiFotoaparata = getIndexes(brKategorija + 1, 3);
            
         //   String[] noviFotoaparati = randomIzListeFotoaparata(indexiKategorijaFotoaparata, brKategorija + 1);
            
          //  kategorija.setKategorija(noveKategorijeFotoaparata[i]);
       //     kategorija.setFotoaparat(noviFotoaparati);
            
            kategorija.setKategorija(noveKategorijeFotoaparata);
            tema.setKategorija(kategorija);
            
           System.out.println(Arrays.toString(tema.getKategorija().getKategorija())); 
            
           Map<String, String[]> aMap = new HashMap<String, String[]>();
            aMap.put("tema" , noveTemeNatjecatelja);
            System.out.println(Arrays.toString(aMap.get("tema")));
            for(int j=0;j<noveKategorijeFotoaparata.length;j++)
            {
                if(noveKategorijeFotoaparata[j] == "DSLR"){
                    
                    DSLR[] test = new DSLR[noveKategorijeFotoaparata.length];
                    test[j] = randomIzListeFotoaparataDSLR(indexiKategorijaFotoaparata, brKategorija, noveKategorijeFotoaparata[j]);
                    System.out.println(Arrays.toString(test));
                }
                if(noveKategorijeFotoaparata[j] == "DSLM"){
                    DSLM[] test = new DSLM[noveKategorijeFotoaparata.length];
                    test[j] = randomIzListeFotoaparataDSLM(indexiKategorijaFotoaparata, brKategorija, noveKategorijeFotoaparata[j]);
                }
                if(noveKategorijeFotoaparata[j] == "Compact"){
                    Compact[] test = new Compact[noveKategorijeFotoaparata.length];
                    test[j] = randomIzListeFotoaparataCompact(indexiKategorijaFotoaparata, brKategorija, noveKategorijeFotoaparata[j]);
                }
                
            }
            
            
      //      tema.setTema(noveTemeNatjecatelja[i]);
            
       
            int j;
            String[][] nTeme = new String[noveTemeNatjecatelja.length][noveKategorijeFotoaparata.length];
           /* for (int y = 0; y < noveTemeNatjecatelja.length; y++) {
                for (j = 0; j < noveKategorijeFotoaparata.length; j++) {
                    nTeme[y][j] = noveTemeNatjecatelja[y] + "  " + noveKategorijeFotoaparata[j];
                    System.out.println(nTeme[y][j]);
                }
            }*/
            
            Natjecatelj natjecatelj = new Natjecatelj(i+1, tema);
            
            
          //  Fotoaparat fotoaparati = natjecatelj.getTema().getKategorija().setFotoaparat();
            
            
       //     System.out.println(Arrays.toString({'asd':'a'}));
            

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
        Random rng = new Random();
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
    
    public static DSLR randomIzListeFotoaparataDSLR(Set<Integer> indexiKategorijaFotoaparata, int brKategorija, String vrsta )
    {
        int x = 0;
        Random rng = new Random();
        
        AbstractFactory DSLRFactory = FactoryProducer.getFactory(vrsta);
        DSLR noviFotoaparati;
        int fotoaparat = rng.nextInt(3 - 1) + 1;
        noviFotoaparati = DSLRFactory.getDSLR(fotoaparat);
        
        noviFotoaparati.makeDSLR();
        
        return noviFotoaparati;
    }
    public static Compact randomIzListeFotoaparataCompact(Set<Integer> indexiKategorijaFotoaparata, int brKategorija, String vrsta )
    {
        int x = 0;
        Random rng = new Random();
        int fotoaparat= rng.nextInt(3 - 1) + 1;
        
        
            AbstractFactory CompactFactory = FactoryProducer.getFactory(vrsta);
            Compact noviFotoaparati = CompactFactory.getCompact(fotoaparat);
            
            noviFotoaparati.makeCompact();
        
                
        return noviFotoaparati;
    }
    public static DSLM randomIzListeFotoaparataDSLM(Set<Integer> indexiKategorijaFotoaparata, int brKategorija, String vrsta )
    {
        int x = 0;
        Random rng = new Random();
        int fotoaparat= rng.nextInt(3 - 1) + 1;
        
        AbstractFactory DSLMFactory = FactoryProducer.getFactory(vrsta);
        DSLM noviFotoaparati = DSLMFactory.getDSLM(fotoaparat);
        
        noviFotoaparati.makeDSLM();
                
        return noviFotoaparati;
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
