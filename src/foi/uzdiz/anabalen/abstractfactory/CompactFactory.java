package foi.uzdiz.anabalen.abstractfactory;

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
    DSLM getDSLM(String dslm) {
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
