package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.CanonIXUS170;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.NikonCoolPixS33;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.SonyDSC200W;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class CompactFactory extends AbstractFactory {

    private String naziv = "";
    private String objektiv = "";
    private boolean okular = false;

    /*
     @Override
     public Compact getCompact(int compact) {
     if(compact == 0){
     return null;
     }		
      
     if(compact == 1){
     return new NikonCoolPixS33();
         
     }else if(compact == 2){
     return new SonyDSC200W();
         
     }else if(compact == 3 ){
     return new CanonIXUS170();
     }
      
     return null;
     }
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setObjektiv(String objektiv) {
        this.objektiv = objektiv;
    }

    public void setOkular(boolean okular) {
        this.okular = okular;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getObjektiv() {
        return objektiv;
    }

    public boolean isOkular() {
        return okular;
    }

    
    
    
    @Override
    public Fotoaparat makeCamera(int compact) {
              
    
        if (compact == 0) {
            return new CanonIXUS170();
        }

        if (compact == 1) {
            return new NikonCoolPixS33();

        } else if (compact == 2) {
            return new SonyDSC200W();

        } 

        return null;
             
    }

}
