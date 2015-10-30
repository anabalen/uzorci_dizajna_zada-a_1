package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class SonyDSC200W extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final boolean okular;

    public SonyDSC200W() {
        this.naziv = "SonyDSC200W";
        this.objektiv = "G-3,3-5,9";
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
