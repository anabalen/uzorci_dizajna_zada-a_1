package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author Ana-Marija
 */
public class NikonD3200 implements DSLR {
    @Override
   public void makeDSLR() {
      System.out.println("Inside Nikon::make() method.");
   }
    
}
