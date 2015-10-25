package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.CanonIXUS170;
import foi.uzdiz.anabalen.abstractfactory.models.NikonCoolPixS33;
import foi.uzdiz.anabalen.abstractfactory.models.SonyDSC200W;
import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author Ana-Marija
 */
public class CompactFactory extends AbstractFactory{

    @Override
    public DSLR getDSLR(String dslr) {
        return null;
    }

    @Override
    public DSLM getDSLM(String dslm) {
        return null;
    }

    @Override
     public Compact getCompact(String compact) {
        if(compact == null){
            return null;
        }		
      
        if(compact.equalsIgnoreCase("NikonCoolPixS33")){
            return new NikonCoolPixS33();
         
        }else if(compact.equalsIgnoreCase("SonyDSC200W")){
            return new SonyDSC200W();
         
        }else if(compact.equalsIgnoreCase("CanonIXUS170")){
            return new CanonIXUS170();
        }
      
        return null;
    }
    
}
