package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public abstract class AbstractFactory {
    
    abstract DSLR getDSLR(String dslr);
    abstract DSLM getDSLM(String dslm);
    abstract Compact getCompact(String compact);
    
}
