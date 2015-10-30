package foi.uzdiz.anabalen.zadaca1;

import java.util.Random;

/**
 *
 * @author Ana-Marija
 */
public class Fotografija {

    protected float blenda;
    protected float ekspozicija;

    public Fotografija() {
        Random rand = new Random();
        float a = rand.nextFloat() * 22;
        float b = rand.nextFloat() * 10;

        this.blenda = a;
        this.ekspozicija = b;
    }

    public float getBlenda() {
        return blenda;
    }

    public float getEkspozicija() {
        return ekspozicija;
    }

}
