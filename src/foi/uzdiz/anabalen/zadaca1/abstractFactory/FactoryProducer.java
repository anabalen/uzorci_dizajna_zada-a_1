package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;

/**
 *
 * @author Ana-Marija
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
   
      if(choice.equalsIgnoreCase("DSLR")){
         return new DSLRFactory();
         
      }else if(choice.equalsIgnoreCase("DSLM")){
         return new DSLMFactory();
      
      }else if(choice.equalsIgnoreCase("Compact")){
         return new CompactFactory();
      }
      
      return null;
   }
}
