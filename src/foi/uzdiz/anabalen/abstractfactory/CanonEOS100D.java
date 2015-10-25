package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS100D implements DSLR {
    
    @Override
   public void makeDSLR() {
      System.out.println("Inside CanonEOS100D::make() method.");
   }
}
