package foi.uzdiz.anabalen.zadaca1.abstractFactory;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS100D;
import foi.uzdiz.anabalen.abstractfactory.models.CanonEOS700D;
import foi.uzdiz.anabalen.abstractfactory.models.NikonD3200;
import foi.uzdiz.anabalen.abstractfactory.interfaces.Compact;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLM;
import foi.uzdiz.anabalen.abstractfactory.interfaces.DSLR;

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

    @Override
    public DSLR getDSLR(int dslr) {

        if (dslr == 0) {
            return null;
        }

        if (dslr == 1) {
            return new CanonEOS700D();

        } else if (dslr == 2) {
            return new NikonD3200();

        } else if (dslr == 3) {
            return new CanonEOS100D();
        }

        return null;
    }

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

    @Override
    public DSLM getDSLM(int dslm) {
        return null;
    }

    @Override
    public Compact getCompact(int compact) {
        return null;
    }

}
