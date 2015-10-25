package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class SonyDSC200W implements Compact{

    @Override
    public void makeCompact() {
        System.out.println("Inside Sony::make() method.");
    }
    
}
