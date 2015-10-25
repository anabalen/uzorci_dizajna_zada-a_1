package foi.uzdiz.anabalen.zadaca1.abstractFactory;


import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.FactoryProducer;
import java.util.Random;

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
        
        int sjeme = Integer.parseInt(args[0]);
        int maxBrTema = Integer.parseInt(args[1]);
       /** int maxBrTemaNatjecatelj = Integer.parseInt(args[2]);
        int maxBrKategorija = Integer.parseInt(args[3]);
        int maxBrNatjecatelja = Integer.parseInt(args[4]);
        int brClanovaZirija = Integer.parseInt(args[5]);
        String klasaBodova = args[6];
        String datoteka = args[7];
        **/
        
        int brTema;
        int brKategorija;
        int brNatjecatelja;
        
        
        Random rand = new Random(sjeme);
        
        brTema = rand.nextInt(maxBrTema-1)+1;
        
        System.out.println(brTema);

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
      DSLM  dslm1 = dslmFactory.getDSLM("LumixG6H");

      //call fill method of Red
      dslm1.makeDSLM();

      //get an object of Color Green
      DSLM  dslm2 = dslmFactory.getDSLM("OlympusEM10");

      //call fill method of Green
      dslm2.makeDSLM();

      //get an object of Color Blue
      DSLM  dslm3 = dslmFactory.getDSLM("SonyA5000");

      //call fill method of Color Blue
      dslm3.makeDSLM();
   }
    
}
