package foi.uzdiz.anabalen.zadaca1.singleton;

/**
 *
 * @author Ana-Marija
 */


public class Natjecanje {

    private static volatile Natjecanje INSTANCE;
    
    
    private Natjecanje() {
    }
    /**
     * Get instance
     * @return 
     */
    public static Natjecanje getInstance() {

        if (INSTANCE == null) {
            synchronized (Natjecanje.class) {

                if (INSTANCE == null) {
                    INSTANCE = new Natjecanje();
                }
            }
        }
        return INSTANCE;
    }
}
