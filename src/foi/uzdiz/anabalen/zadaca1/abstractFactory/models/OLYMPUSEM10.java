package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;

/**
 *
 * @author Ana-Marija
 */
public class OLYMPUSEM10 implements Fotoaparat {

    
    @Override
    public String make() {
        
         DSLMFactory camera = new DSLMFactory();
        camera.setNaziv("Olympus E-M10");
        camera.setObjektiv("14-42mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        
        
        return camera.getObjektiv();
       //  System.out.println("Inside Olympus::make() method.");
    }
    
}
