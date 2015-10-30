package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.CanonEOS100D;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.CanonEOS700D;
import foi.uzdiz.anabalen.zadaca1.abstractfactory.models.NikonD3200;

/**
 *
 * @author Ana-Marija
 */
public class DSLRFactory implements AbstractFactory {

    private String naziv;
    private String objektiv;
    private String zoom;
    private boolean intgriraniRukohvat;
    private boolean intgriraniBlic;
    private boolean stabilizacijaSlike;

    public DSLRFactory() {
        this.naziv = naziv;
        this.objektiv = objektiv;
        this.zoom = zoom;
        this.intgriraniRukohvat = intgriraniRukohvat;
        this.intgriraniBlic = intgriraniBlic;
        this.stabilizacijaSlike = stabilizacijaSlike;

    }

    @Override
    public Fotoaparat createFotoaparat(int dslr) {

        if (dslr == 0) {
            return new CanonEOS100D();

        }

        if (dslr == 1) {
            return new CanonEOS700D();

        } else if (dslr == 2) {
            return new NikonD3200();

        }

        return null;

    }

}
