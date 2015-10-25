package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class DSLRFactory extends AbstractFactory {

    @Override
    public DSLR getDSLR(String dslr) {
        
        if(dslr == null){
            return null;
        }		
      
        if(dslr.equalsIgnoreCase("CanonEOS700D")){
            return new CanonEOS700D();
         
        }else if(dslr.equalsIgnoreCase("NikonD3200")){
            return new NikonD3200();
         
        }else if(dslr.equalsIgnoreCase("CanonEOS100D")){
            return new CanonEOS100D();
        }
      
        return null;
    }

    @Override
    DSLM getDSLM(String dslm) {
        return null;
    }

    @Override
    Compact getCompact(String compact) {
        return null;
    }
    
    
    
}
