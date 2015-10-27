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
    abstract  DSLR getDSLR(int dslr);
    abstract  DSLM getDSLM(int dslm);
    abstract  Compact getCompact(int compact);
    
}
