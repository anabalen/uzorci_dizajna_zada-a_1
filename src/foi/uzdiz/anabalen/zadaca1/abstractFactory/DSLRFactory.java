package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS100D;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS700D;
import foi.uzdiz.anabalen.abstractfactory.models.NikonD3200;

/**
 *
 * @author Ana-Marija
 */
public class DSLRFactory extends AbstractFactory {

    private String naziv = "";
    private String objektiv = "";
    private String zoom = "";
    private boolean integriraniRukohvat = false;
    private boolean integriraniBlic = false;
    private boolean stabilizacijaSlike = false;

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setObjektiv(String objektiv) {
        this.objektiv = objektiv;
    }

    public void setZoom(String zoom) {
        this.zoom = zoom;
    }

    public void setIntegriraniRukohvat(boolean integriraniRukohvat) {
        this.integriraniRukohvat = integriraniRukohvat;
    }

    public void setIntegriraniBlic(boolean integriraniBlic) {
        this.integriraniBlic = integriraniBlic;
    }

    public void setStabilizacijaSlike(boolean stabilizacijaSlike) {
        this.stabilizacijaSlike = stabilizacijaSlike;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getObjektiv() {
        return objektiv;
    }

    public String getZoom() {
        return zoom;
    }

    public boolean isIntegriraniRukohvat() {
        return integriraniRukohvat;
    }

    public boolean isIntegriraniBlic() {
        return integriraniBlic;
    }

    public boolean isStabilizacijaSlike() {
        return stabilizacijaSlike;
    }

    
    
    
    /**
     * popraviti, fali ulazni parametar
     *
     * @return
     */
    @Override
    public Fotoaparat makeCamera(int dslr) {

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
