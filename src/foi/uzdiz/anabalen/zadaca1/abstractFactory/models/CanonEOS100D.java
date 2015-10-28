package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS100D implements Fotoaparat {
    
    @Override
    public void make() {
       
       DSLRFactory camera = new DSLRFactory();
        camera.setNaziv("CanonEOS100D");
        camera.setObjektiv("EF-S 55-250mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        camera.setIntegriraniBlic(true);
        camera.setStabilizacijaSlike(false);
               
      System.out.println("Inside Canon::make() method.");
   }

    
    
}
