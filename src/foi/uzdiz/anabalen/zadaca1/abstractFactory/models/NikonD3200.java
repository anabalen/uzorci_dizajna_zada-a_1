package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLRFactory;

/**
 *
 * @author Ana-Marija
 */
public class NikonD3200 implements Fotoaparat {

   @Override
   public String make() {
       
       DSLRFactory camera = new DSLRFactory();
        camera.setNaziv("NikonD3200");
        camera.setObjektiv("AF 18-105mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        camera.setIntegriraniBlic(true);
        camera.setStabilizacijaSlike(false);
        
        return camera.getObjektiv();
     // System.out.println("Inside Nikon::make() method.");
   }
    
}
