package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS700D implements Fotoaparat{

   public String make() {
       
       DSLRFactory camera = new DSLRFactory();
        camera.setNaziv("CanonEOS700D");
        camera.setObjektiv("EF-S 10-18mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        camera.setIntegriraniBlic(false);
        camera.setStabilizacijaSlike(false);
        
        return camera.getObjektiv();
       
      //System.out.println("Inside Canon::make() method.");
   }

   
}
