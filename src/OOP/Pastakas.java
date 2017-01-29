package OOP;

/**
 * Created by jrihma on 25-Jan-17.
 */
public class Pastakas {
    int tindikogus;

    public Pastakas(int tind) {
        tindikogus = tind;

    }

    public void kirjuta(String text) {

        if (tindikogus > text.length()) {
            System.out.println(text);
            tindikogus = tindikogus - text.length();

        } else {
            System.out.println(text.substring(0,tindikogus));

        }

    }

    public void prindiPaljuTintiAlles() {
        System.out.println(tindikogus);

    }
}
