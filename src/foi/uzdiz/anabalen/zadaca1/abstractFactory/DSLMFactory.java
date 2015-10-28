package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.LUMIXG6H;
import foi.uzdiz.anabalen.abstractfactory.models.OLYMPUSEM10;
import foi.uzdiz.anabalen.abstractfactory.models.SonyA5000;


/**
 *
 * @author Ana-Marija
 */
public class DSLMFactory extends AbstractFactory{

    private String naziv = "";
    private String objektiv = "";
    private String zoom = "";
    private boolean integriraniRukohvat = false;

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

    public String getNaziv() {
        return naziv;
    }

    public String getObjektiv() {
        return objektiv;
    }

    public String getZoom() {
        return zoom;
    }

    public boolean isIntegriraniRukohvat() {
        return integriraniRukohvat;
    }
  

    
    
    @Override
    public Fotoaparat makeCamera(int dslm) {
        
    
        if(dslm == 0){
            return new SonyA5000();
        }		
      
        if(dslm == 1){
            return new LUMIXG6H();
         
        }else if(dslm == 2){
            return new OLYMPUSEM10();
         
        }
      
        return null;
              
    }
    
}
