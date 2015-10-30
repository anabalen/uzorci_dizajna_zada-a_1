package foi.uzdiz.anabalen.zadaca1.abstractfactory.models;


import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;

/**
 *
 * @author Ana-Marija
 */
public class NikonD3200 extends Fotoaparat {
    private final String naziv;
    private final String objektiv;
    private final String zoom;
    private final boolean intgriraniRukohvat;
    private final boolean intgriraniBlic;
    private final boolean stabilizacijaSlike;
      
    public NikonD3200(){
        this.naziv = "NikonD3200";
        this.objektiv = "AF 18-105mm";
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
