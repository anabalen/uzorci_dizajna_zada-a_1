package foi.uzdiz.anabalen.zadaca1;

/**
 *
 * @author Ana-Marija
 */
public class Fotografija {
    
    protected float blenda;
    protected float ekspozicija;
    
    public Fotografija(float blenda, float ekspozicija){
        this.blenda = blenda;
        this.ekspozicija=ekspozicija;
    }

    public float getBlenda() {
        return blenda;
    }

    public float getEkspozicija() {
        return ekspozicija;
    }

    public void setBlenda(float blenda) {
        this.blenda = blenda;
    }

    public void setEkspozicija(float ekspozicija) {
        this.ekspozicija = ekspozicija;
    }
    
    
   
}
