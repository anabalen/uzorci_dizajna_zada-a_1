package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class OLYMPUSEM10 extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean dodatniRukohvat;

    public OLYMPUSEM10() {
        this.naziv = "OLYMPUSEM10";
        this.objektiv = "14-42mm";
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
