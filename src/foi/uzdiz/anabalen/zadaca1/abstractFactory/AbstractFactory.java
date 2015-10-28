package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;


/**
 *
 * @author Ana-Marija
 */
public abstract class AbstractFactory {
    
    public abstract Fotoaparat makeCamera(int broj);
    
    
    public static AbstractFactory getFactory(String kategorija) {
        
    if (kategorija == "DSLR"){
        return new DSLRFactory();
    }
    else if(kategorija == "DSLM"){
        return new DSLMFactory();
    }
    else{
        return new CompactFactory();
    }
    
    }
}
