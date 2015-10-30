package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS100D extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean intgriraniRukohvat;
    private final boolean intgriraniBlic;
    private final boolean stabilizacijaSlike;

    public CanonEOS100D() {
        this.naziv = "CanonEOS100D";
        this.objektiv = "EF-S 55-250mm";
        this.zoom = "3x";
        this.intgriraniRukohvat = true;
        this.intgriraniBlic = true;
        this.stabilizacijaSlike = false;
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

    public boolean isIntgriraniRukohvat() {
        return intgriraniRukohvat;
    }

    public boolean isIntgriraniBlic() {
        return intgriraniBlic;
    }

    public boolean isStabilizacijaSlike() {
        return stabilizacijaSlike;
    }

}
