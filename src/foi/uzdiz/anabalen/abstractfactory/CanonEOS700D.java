package foi.uzdiz.anabalen.abstractfactory;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS700D implements DSLR{
    @Override
   public void makeDSLR() {
      System.out.println("Inside Canon::make() method.");
   }
}
