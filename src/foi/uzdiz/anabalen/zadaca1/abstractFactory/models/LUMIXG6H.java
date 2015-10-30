package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class LUMIXG6H extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean dodatniRukohvat;

    public LUMIXG6H() {
        this.naziv = "LUMIXG6H";
        this.objektiv = "H-PS14042";
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
