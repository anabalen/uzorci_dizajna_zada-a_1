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

        Set<Integer> indexi = getIndexes(brTema,listaTema.length-1);
        String[] noveTeme = new String[brTema];
        int x = 0;
        for (Integer index : indexi) {
            if(x>brTema-1){break;}
            else{
                noveTeme[x] = listaTema[index];
                //System.out.println(noveTeme[x]+" "+ x); 
                x++;
            }
        } 
          
        Random slucajnaTema = new Random();
        int brojTemaNatjecatelja;
        int brojTeme;
        String[] temeZaNatjecatelja;
        for(int i = 0;i <brNatjecatelja; i++){
            Natjecatelj natjecatelj = new Natjecatelj();
            brojTemaNatjecatelja = slucajnaTema.nextInt((brTema+1)-1)+1;
            temeZaNatjecatelja = new String[brojTemaNatjecatelja];            
            Set<Integer> indexiNatjecatelja = getIndexes(brojTemaNatjecatelja, brTema);
            String[] noveTemeNatjecatelja = new String[brojTemaNatjecatelja];
            
            int y = 0;
            for (Integer index : indexiNatjecatelja) {
                if(y>brojTemaNatjecatelja-1){break;}
                else{
                    
                    noveTemeNatjecatelja[y] = noveTeme[index-1];
                    y++;
                }
            } 
               
            natjecatelj.setTema(noveTemeNatjecatelja);
            System.out.println(indexiNatjecatelja);
            System.out.println(Arrays.toString(natjecatelj.getTema()));
        }
        //get DSLR factory
        AbstractFactory dslrFactory = FactoryProducer.getFactory("DSLR");

        DSLR dslr1;
        dslr1 = dslrFactory.getDSLR("CanonEOS700D");

        //call draw method of Shape Circle
        dslr1.makeDSLR();

        DSLR dslr2;
        dslr2 = dslrFactory.getDSLR("NikonD3200");

        //call draw method of Shape Rectangle
        dslr2.makeDSLR();

        DSLR dslr3;
        dslr3 = dslrFactory.getDSLR("CanonEOS100D");

        //call draw method of Shape Square
        dslr3.makeDSLR();

        //get color factory
        AbstractFactory dslmFactory = FactoryProducer.getFactory("DSLM");

        //get an object of Color Red
        DSLM dslm1 = dslmFactory.getDSLM("LumixG6H");

        //call fill method of Red
        dslm1.makeDSLM();

        //get an object of Color Green
        DSLM dslm2 = dslmFactory.getDSLM("OlympusEM10");

        //call fill method of Green
        dslm2.makeDSLM();

        //get an object of Color Blue
        DSLM dslm3 = dslmFactory.getDSLM("SonyA5000");

        //call fill method of Color Blue
        dslm3.makeDSLM();
    }
    /**
     * Dobivanje indexa za teme
     * @param velicina
     * @return 
     */
    public static Set<Integer> getIndexes(int velicina, int broj)
    {
        Set<Integer> indexi = new LinkedHashSet<>();
        Random rng = new Random(); 
        
        while (indexi.size() < velicina) {
            Integer next = rng.nextInt(broj - 0) + 1;
            indexi.add(next);
        }
        
        return indexi;
    }

}
