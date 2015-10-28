package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.CompactFactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonIXUS170 implements Fotoaparat
{
    
    /**
     *
     */
    @Override
    public void make() {
        
         CompactFactory camera = new CompactFactory();
        camera.setNaziv("Canon IXUS170");
        camera.setObjektiv("4.5-54mm");
        camera.setOkular(false);
        
         System.out.println("Inside Canon::make() method.");
    }

 
    
}
