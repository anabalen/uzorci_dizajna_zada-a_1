package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS100D implements DSLR {
    
    @Override
   public void makeDSLR() {
       
        DSLRFactory camera = new DSLRFactory();
        camera.setNaziv("CanonEOS100D");
        camera.setObjektiv("EF-S 55-250mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        camera.setIntegriraniBlic(true);
        camera.setStabilizacijaSlike(false);
        
      System.out.println("Inside CanonEOS100D::make() method.");
   }
}
