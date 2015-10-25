package foi.uzdiz.anabalen.abstractfactory.models;

/**
 *
 * @author Ana-Marija
 */

public class Natjecatelj {
    /**
     * String naziv
     */
    protected String naziv;
    /**
     * String tema
     */
    protected String[] tema;

    public void setTema(String[] tema) {
        this.tema = tema;
    }

    public void setKategorijaFotoaparata(String kategorijaFotoaparata) {
        this.kategorijaFotoaparata = kategorijaFotoaparata;
    }

    public String[] getTema() {
        return tema;
    }

    public String getKategorijaFotoaparata() {
        return kategorijaFotoaparata;
    }
    /**
     * String kategorijaFotoaparata
     */
    protected String kategorijaFotoaparata;
    /**
     * Set natjecatelja
     * @param naziv 
     */
    public void setNatjecatelj(String naziv)
    {
        this.naziv=naziv;    
    }
    /**
     * Get natjecatelj
     * @return 
     */
    public String getNatjecatelj(){  
        return this.naziv;
    }
}
