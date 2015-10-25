package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class DSLMFactory extends AbstractFactory{

    @Override
    public DSLR getDSLR(String dslr) {
        return null;
    }

    @Override
    public DSLM getDSLM(String dslm) {
        
        if(dslm == null){
            return null;
        }		
      
        if(dslm.equalsIgnoreCase("LumixG6H")){
            return new LUMIXG6H();
         
        }else if(dslm.equalsIgnoreCase("OlympusEM10")){
            return new OLYMPUSEM10();
         
        }else if(dslm.equalsIgnoreCase("SonyA5000")){
            return new SonyA5000();
        }
      
        return null;
    }
  

    @Override
    Compact getCompact(String compact) {
        return null;
    }
    
}
