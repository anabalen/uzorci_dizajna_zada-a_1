package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.LUMIXG6H;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.OLYMPUSEM10;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.SonyA5000;

/**
 *
 * @author Ana-Marija
 */
public class DSLMFactory implements AbstractFactory {

    private String naziv;
    private String objektiv;
    private String zoom;
    private boolean dodatniRukohvat;

    public DSLMFactory() {
        this.naziv = naziv;
        this.objektiv = objektiv;
        this.zoom = zoom;
        this.dodatniRukohvat = dodatniRukohvat;
    }

    @Override
    public Fotoaparat createFotoaparat(int dslm) {

        if (dslm == 0) {
            return new SonyA5000();

        }

        if (dslm == 1) {
            return new LUMIXG6H();

        } else if (dslm == 2) {
            return new OLYMPUSEM10();

        }

        return null;

    }

}
