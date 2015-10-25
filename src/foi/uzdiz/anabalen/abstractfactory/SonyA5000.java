package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class SonyA5000 implements DSLM{

    @Override
    public void makeDSLM() {
        System.out.println("Inside Sony::make() method.");
    }
    
}
