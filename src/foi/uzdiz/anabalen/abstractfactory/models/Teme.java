package foi.uzdiz.anabalen.abstractfactory.models;

/**
 *
 * @author Ana-Marija
 */
public class Teme {
    
    protected String naziv;
    
    
    
    public void setTema(String naziv)
    {
        this.naziv=naziv;    
    }
    public String getTeme(){  
        return this.naziv;
    }
}
