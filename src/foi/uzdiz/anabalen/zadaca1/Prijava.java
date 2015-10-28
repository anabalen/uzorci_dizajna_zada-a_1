/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foi.uzdiz.anabalen.zadaca1;

import foi.uzdiz.anabalen.zadaca1.abstractfactory.interfaces.Fotoaparat;
import foi.uzdiz.anabalen.zadaca1.abstractFactory.AbstractFactory;
import java.util.Random;

/**
 *
 * @author mario
 */
public class Prijava {

    protected int brNatjecatelja;
    protected String tema;
    protected String kategorija;
    protected Fotoaparat fotic;
    protected int fotografija;
    protected AbstractFactory factory;

    
    public Prijava(int brNatjecatelja, String tema, String kategorija, AbstractFactory factory) {

        this.brNatjecatelja = brNatjecatelja;
        this.tema = tema;
        this.kategorija = kategorija;
        this.factory = factory;
       
        //this.fotoaparat = fotoaparat;
        //Fotoaparat fotoaparat = factory.makeCamera();
        //this.fotografija = fotografija;

        int redniBrojFotica;
        Random rndFotic = new Random();
        redniBrojFotica = rndFotic.nextInt(3 - 0) + 0;

        fotic = factory.makeCamera(redniBrojFotica);
        fotic.make();

    }

    /**
     * Getteri i setteri za prijavu
     *
     * @return
     */
    public int getBrNatjecatelja() {
        return brNatjecatelja;
    }

    public String getTema() {
        return tema;
    }

    public String getKategorija() {
        return kategorija;
    }

    public Fotoaparat getFotoaparat() {
        
        return fotic;
    }

    public int getFotografija() {
        return fotografija;
    }

    public void setBrNatjecatelja(int brNatjecatelja) {
        this.brNatjecatelja = brNatjecatelja;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public void setFotoaparat(Fotoaparat fotoaparat) {
        this.fotic = fotoaparat;
    }

    public void setFotografija(int fotografija) {
        this.fotografija = fotografija;
    }

}
