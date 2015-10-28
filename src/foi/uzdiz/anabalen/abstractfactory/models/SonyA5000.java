package foi.uzdiz.anabalen.abstractfactory.models;


import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.DSLMFactory;

/**
 *
 * @author Ana-Marija
 */
public class SonyA5000 implements Fotoaparat{

   
    @Override
    public void make() {
        
         DSLMFactory camera = new DSLMFactory();
        camera.setNaziv("Sony A5000");
        camera.setObjektiv("16-50mm");
        camera.setZoom("3x");
        camera.setIntegriraniRukohvat(true);
        
        System.out.println("Inside Sony::make() method.");
    }
    
}
