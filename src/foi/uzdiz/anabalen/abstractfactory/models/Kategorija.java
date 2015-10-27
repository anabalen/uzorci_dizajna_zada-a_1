/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foi.uzdiz.anabalen.abstractfactory.models;

/**
 *
 * @author mario
 */
public class Kategorija {
    protected String[] kategorija;
    protected Fotoaparat fotoaparat;

    public void setKategorija(String[] kategorija) {
        this.kategorija = kategorija;
    }

    public String[] getKategorija() {
        return kategorija;
    }
    
    public void setFotoaparat(Fotoaparat fotoaparat) {
        this.fotoaparat = fotoaparat;
    }

    public Fotoaparat getFotoaparat() {
        return fotoaparat;
    }
    
    
}
