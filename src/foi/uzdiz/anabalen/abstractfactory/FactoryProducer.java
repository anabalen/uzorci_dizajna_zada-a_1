package foi.uzdiz.anabalen.abstractfactory;

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
