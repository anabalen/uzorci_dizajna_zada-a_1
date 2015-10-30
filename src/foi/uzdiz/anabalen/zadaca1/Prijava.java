package foi.uzdiz.anabalen.zadaca1;

import foi.uzdiz.anabalen.zadaca1.abstractFactory.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;

/**
 *
 * @author Ana-Marija
 */
public final class Prijava {

    protected Natjecatelj natjecatelj;
    protected Tema tema;
    protected Kategorija kategorija;
    protected Fotoaparat fotic;
    protected Fotografija fotografija;
    protected AbstractFactory factory;
    protected int korektnost;

    public Prijava() {
    }

    public Prijava(Natjecatelj natjecatelj, Tema tema, Kategorija kategorija, Fotoaparat fotoaparat, Fotografija fotografija, int korektnost) {

        this.natjecatelj = natjecatelj;
        this.tema = tema;
        this.kategorija = kategorija;
        this.korektnost = korektnost;
        this.fotografija = fotografija;
        this.fotic = fotoaparat;

    }

    /**
     * Getteri i setteri za prijavu
     *
     * @return
     */
    public Natjecatelj getBrNatjecatelja() {
        return natjecatelj;
    }

    public Tema getTema() {
        return tema;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public Fotoaparat getFotoaparat() {

        return fotic;
    }

    public Fotografija getFotografija() {
        return fotografija;
    }

    public void setBrNatjecatelja(Natjecatelj natjecatelj) {
        this.natjecatelj = natjecatelj;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public void setFotoaparat(Fotoaparat fotoaparat) {
        this.fotic = fotoaparat;
    }

    public void setFotografija(Fotografija fotografija) {
        this.fotografija = fotografija;
    }

    public int getKorektnost() {
        return korektnost;
    }

    public void setKorektnost(int korektnost) {
        this.korektnost = korektnost;
    }

}
