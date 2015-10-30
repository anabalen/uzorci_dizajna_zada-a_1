package foi.uzdiz.anabalen.zadaca1.singleton;

import foi.uzdiz.anabalen.zadaca1.Prijava;

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
     *
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

    public Prijava init() {
        Prijava prijava = new Prijava();
        return prijava;
    }

}
