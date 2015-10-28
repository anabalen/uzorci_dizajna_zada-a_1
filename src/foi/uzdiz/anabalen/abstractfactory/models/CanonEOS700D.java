package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS700D implements Fotoaparat{

   public void make() {
       
       DSLRFactory camera = new DSLRFactory();
        camera.setNaziv("CanonEOS700D");
        camera.setObjektiv("EF-S 10-18mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        camera.setIntegriraniBlic(false);
        camera.setStabilizacijaSlike(false);
       
      System.out.println("Inside Canon::make() method.");
   }

   
}
