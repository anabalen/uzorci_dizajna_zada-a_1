package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;

/**
 *
 * @author Ana-Marija
 */
public class NikonCoolPixS33 implements Compact{

    @Override
    public void makeCompact() {
        
        CompactFactory camera = new CompactFactory();
        camera.setNaziv("Nikon CoolPix S33");
        camera.setObjektiv("NIKKOR 4.1-12.3mm");
        camera.setOkular(false);
        
        System.out.println("Inside Nikon::make() method.");
    }
    
    
}
