package foi.uzdiz.anabalen.zadaca1;

/**
 *
 * @author Ana-Marija
 */
public class Natjecatelj {

    protected int rbrNatjecatelja;
    protected Teme tema;
    protected String kategorijaFotoaparata;

    public Natjecatelj(int rbrNatjecatelja, Teme tema) {
        this.rbrNatjecatelja = rbrNatjecatelja;
        this.tema = tema;
    }

    /**
     * Getter i setter za teme
     */
    public void setTema(Teme tema) {
        this.tema = tema;
    }

    public Teme getTema() {
        return tema;
    }

    /**
     * Getter i setter za kategoriju fotoaparata
     */
    public void setKategorijaFotoaparata(String kategorijaFotoaparata) {
        this.kategorijaFotoaparata = kategorijaFotoaparata;
    }

    public String getKategorijaFotoaparata() {
        return kategorijaFotoaparata;
    }

    /**
     * Getter i setter za redni broj natjecatelja
     * @param rednibroj
     */
    public void setNatjecatelj(int rednibroj) {
        this.rbrNatjecatelja = rednibroj;
    }

    public int getNatjecatelj() {
        return this.rbrNatjecatelja;
    }
}
