package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS100D;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS700D;
import foi.uzdiz.anabalen.abstractfactory.models.NikonD3200;
import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

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
    public DSLM getDSLM(String dslm) {
        return null;
    }

    @Override
    public Compact getCompact(String compact) {
        return null;
    }
    
    
    
}
