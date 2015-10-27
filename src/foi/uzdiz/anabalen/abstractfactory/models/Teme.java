package foi.uzdiz.anabalen.abstractfactory.models;

/**
 *
 * @author Ana-Marija
 */
public class Teme {
    
    protected String naziv;
    protected Kategorija kategorija;
    
    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }
    
    public Kategorija getKategorija() {
        return kategorija;
    }

    
    public void setTema(String naziv)
    {
        this.naziv=naziv;    
    }
    public String getTeme(){  
        return this.naziv;
    }
}
