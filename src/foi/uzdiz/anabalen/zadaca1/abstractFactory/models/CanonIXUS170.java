package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class CanonIXUS170 extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final boolean okular;

    public CanonIXUS170() {
        this.naziv = "CanonIXUS170";
        this.objektiv = "4,5-54,00mm";
        this.okular = false;
    }

    @Override
    public String getNaziv() {
        return this.naziv;
    }

    @Override
    public String getObjektiv() {
        return this.objektiv;
    }

    public boolean isOkular() {
        return okular;
    }

}
