package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;

/**
 *
 * @author Ana-Marija
 */
public class SonyDSC200W implements Fotoaparat{


    @Override
    public String make() {
        
        CompactFactory camera = new CompactFactory();
        camera.setNaziv("Sony DSC-WX200B");
        camera.setObjektiv("3.3-5.9mm");
        camera.setOkular(false);
        
        return camera.getObjektiv();
       // System.out.println("Inside Sony::make() method.");
    }
    
}
