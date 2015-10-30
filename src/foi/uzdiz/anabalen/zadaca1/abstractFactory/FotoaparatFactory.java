package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import java.util.Random;

/**
 *
 * @author Ana-Marija
 */
public class FotoaparatFactory {

    public static Fotoaparat getFotoaparat(AbstractFactory factory) {

        int a;
        Random rnd = new Random();
        a = rnd.nextInt(3 - 1) + 1;

        return factory.createFotoaparat(a);
    }
}
