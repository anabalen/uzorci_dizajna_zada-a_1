package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class NikonCoolPixS33 extends Fotoaparat {

    private final String naziv;
    private final String objektiv;
    private final boolean okular;

    public NikonCoolPixS33() {
        this.naziv = "NikonCoolPixS33";
        this.objektiv = "H-PS140442";
        this.okular = true;
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
