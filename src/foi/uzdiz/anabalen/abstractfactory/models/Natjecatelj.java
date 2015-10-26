package foi.uzdiz.anabalen.abstractfactory.models;

/**
 *
 * @author Ana-Marija
 */

public class Natjecatelj {
  
    protected int rbrNatjecatelja;
    protected String[] tema;
     protected String[] kategorijaFotoaparata;

     
     /**
     * Getter i setter za teme
     */
    public void setTema(String[] tema) {
        this.tema = tema;
    }
    public String[] getTema() {
        return tema;
    }

    
    /**
     * Getter i setter za kategoriju fotoaparata
     */
    
    public void setKategorijaFotoaparata(String[] kategorijaFotoaparata) {
        this.kategorijaFotoaparata = kategorijaFotoaparata;
    }

    public String[] getKategorijaFotoaparata() {
        return kategorijaFotoaparata;
    }
    
    
    /**
     * Getter i setter za redni broj natjecatelja
     */
    public void setNatjecatelj(int rednibroj)
    {
        this.rbrNatjecatelja=rednibroj;    
    }
 
    public int getNatjecatelj(){  
        return this.rbrNatjecatelja;
    }
}
