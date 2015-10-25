package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;

/**
 *
 * @author Ana-Marija
 */
public class LUMIXG6H implements DSLM{

    @Override
    public void makeDSLM() {
      System.out.println("Inside Lumix::make() method.");
    }
    
}
