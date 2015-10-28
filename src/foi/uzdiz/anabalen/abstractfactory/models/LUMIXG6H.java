package foi.uzdiz.anabalen.abstractfactory.models;


import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;

/**
 *
 * @author Ana-Marija
 */
public class LUMIXG6H implements Fotoaparat{


    @Override
    public void make() {
        
         DSLMFactory camera = new DSLMFactory();
        camera.setNaziv("Lumix G DMC-G6H");
        camera.setObjektiv("H-PS14042");
        camera.setZoom("4x");
        camera.setIntegriraniRukohvat(true);
        
        
      System.out.println("Inside Lumix::make() method.");
    }
    
}
