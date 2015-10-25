package foi.uzdiz.anabalen.abstractfactory.models;

import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;

/**
 *
 * @author Ana-Marija
 */
public class OLYMPUSEM10 implements DSLM {

    @Override
    public void makeDSLM() {
         System.out.println("Inside Olympus::make() method.");
    }
    
}
