package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS700D implements DSLR{
    @Override
   public void makeDSLR() {
      System.out.println("Inside Canon::make() method.");
   }
}
