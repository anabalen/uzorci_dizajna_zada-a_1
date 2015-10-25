
import foi.uzdiz.anabalen.abstractfactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.DSLM;
import foi.uzdiz.anabalen.abstractfactory.DSLR;
import foi.uzdiz.anabalen.abstractfactory.DSLRFactory;
import foi.uzdiz.anabalen.abstractfactory.FactoryProducer;

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

      //get DSLR factory
      AbstractFactory dslrFactory = FactoryProducer.getFactory("DSLR");

      //get an object of DSLR Canon
      DSLR dslr1 = dslrFactory.getDSLR("CanonEOS700D");

      //call draw method of Shape Circle
      dslr1.makeDSLR();

      //get an object of Shape Rectangle
      DSLR dslr2 = dslrFactory.getDSLR("NikonD3200");

      //call draw method of Shape Rectangle
      dslr2.makeDSLR();
      
      //get an object of Shape Square 
      DSLR dslr3 = dslrFactory.getDSLR("CanonEOS100D");

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
