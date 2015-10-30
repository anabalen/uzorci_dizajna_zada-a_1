package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.CanonIXUS170;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.NikonCoolPixS33;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.SonyDSC200W;

/**
 *
 * @author Ana-Marija
 */
public class CompactFactory implements AbstractFactory {

    private String naziv;
    private String objektiv;
    private boolean okular;

    public CompactFactory() {
        this.naziv = naziv;
        this.objektiv = objektiv;
        this.okular = okular;
    }

    @Override
    public Fotoaparat createFotoaparat(int compact) {

        if (compact == 0) {
            return new CanonIXUS170();

        }

        if (compact == 1) {
            return new NikonCoolPixS33();

        } else if (compact == 2) {
            return new SonyDSC200W();

        }

        return null;

    }

}
