package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;

/**
 *
 * @author Ana-Marija
 */
public class CanonIXUS170 implements Compact
{
    @Override
    public void makeCompact() {
         System.out.println("Inside Canon::make() method.");
    }
    
}
