package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.LUMIXG6H;
import foi.uzdiz.anabalen.abstractfactory.models.OLYMPUSEM10;
import foi.uzdiz.anabalen.abstractfactory.models.SonyA5000;
import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author Ana-Marija
 */
public class DSLMFactory extends AbstractFactory{

    private String naziv = "";
    private String objektiv = "";
    private String zoom = "";
    private boolean integriraniRukohvat = false;

    
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
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public void setObjektiv(String objektiv) {
        this.objektiv = objektiv;
    }
    
    public void setZoom(String zoom) {
        this.zoom = zoom;
    }
    
    public void setIntegriraniRukohvat(boolean integriraniRukohvat) {
        this.integriraniRukohvat = integriraniRukohvat;
    }
  

    @Override
    public Compact getCompact(String compact) {
        return null;
    }
    
}
