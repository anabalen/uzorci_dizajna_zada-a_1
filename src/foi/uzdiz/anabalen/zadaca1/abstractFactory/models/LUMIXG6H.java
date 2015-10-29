package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;

/**
 *
 * @author Ana-Marija
 */
public class LUMIXG6H implements Fotoaparat{


    @Override
    public String make() {
        
         DSLMFactory camera = new DSLMFactory();
        camera.setNaziv("Lumix G DMC-G6H");
        camera.setObjektiv("H-PS14042");
        camera.setZoom("4x");
        camera.setIntegriraniRukohvat(true);
        
        return camera.getObjektiv();
     // System.out.println("Inside Lumix::make() method.");
    }
    
}
