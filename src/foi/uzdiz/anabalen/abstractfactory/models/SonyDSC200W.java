package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;

/**
 *
 * @author Ana-Marija
 */
public class SonyDSC200W implements Compact{

    @Override
    public void makeCompact() {
        
        CompactFactory camera = new CompactFactory();
        camera.setNaziv("Sony DSC-WX200B");
        camera.setObjektiv("3.3-5.9mm");
        camera.setOkular(false);
        
        System.out.println("Inside Sony::make() method.");
    }
    
}
