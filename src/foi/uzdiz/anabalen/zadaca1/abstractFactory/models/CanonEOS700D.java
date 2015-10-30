package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class CanonEOS700D extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean intgriraniRukohvat;
    private final boolean intgriraniBlic;
    private final boolean stabilizacijaSlike;

    public CanonEOS700D() {
        this.naziv = "CanonEOS700D";
        this.objektiv = "EF-S 10-18mm";
        this.zoom = "3x";
        this.intgriraniRukohvat = true;
        this.intgriraniBlic = false;
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
        return this.zoom;
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
