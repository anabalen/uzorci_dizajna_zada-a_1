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
    protected String kategorija;

    public void setKategorija(String kategorija) {
        this.kategorija = kategorija;
    }

    public String getKategorija() {
        return kategorija;
    }
    protected String[] fotoaparat;

    
    public void setFotoaparat(String[] fotoaparat) {
        this.fotoaparat = fotoaparat;
    }

    public String[] getFotoaparat() {
        return fotoaparat;
    }
    
    
}
