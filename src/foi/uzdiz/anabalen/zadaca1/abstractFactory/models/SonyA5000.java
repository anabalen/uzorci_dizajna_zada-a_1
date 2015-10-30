package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class SonyA5000 extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean dodatniRukohvat;

    public SonyA5000() {
        this.naziv = "SonyA5000";
        this.objektiv = "16-50mm OSS";
        this.zoom = "4x";
        this.dodatniRukohvat = true;
    }

    @Override
    public String getNaziv() {
        return this.naziv;
    }

    @Override
    public String getObjektiv() {
        return this.objektiv;
    }

    public String getZoom() {
        return zoom;
    }

    public boolean isDodatniRukohvat() {
        return dodatniRukohvat;
    }

}
