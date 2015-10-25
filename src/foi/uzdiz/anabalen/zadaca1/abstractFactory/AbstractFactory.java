package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

/**
 *
 * @author Ana-Marija
 */
public abstract class AbstractFactory {
    
    /**
     *
     * @param dslr
     * @return
     */
    abstract  DSLR getDSLR(String dslr);
    abstract  DSLM getDSLM(String dslm);
    abstract  Compact getCompact(String compact);
    
}
