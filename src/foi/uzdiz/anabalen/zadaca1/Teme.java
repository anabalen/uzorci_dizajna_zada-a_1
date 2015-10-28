package foi.uzdiz.anabalen.zadaca1;

import foi.uzdiz.anabalen.zadaca1.Kategorija;

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
