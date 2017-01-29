package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jrihma on 25-Jan-17.
 */
public class Chat {
    String toaNimi;
    ArrayList<String[]> nimiSonum = new ArrayList<>();


    public Chat(String tuba) {

        toaNimi = tuba;
    }

    public void sisestaSonum(String nimi, String lause) {
        String[] rida = new String[2];

        rida[0] = nimi;
        rida[1] = lause;
        nimiSonum.add(rida);


    }


    public void prindiKoikSonumidKoosKasutajanimega() {
        for (int i = 0; i < nimiSonum.size(); i++) {
            System.out.println(Arrays.toString(nimiSonum.get(i)));
        }


    }

    public void adminKustutabSonumi(String kustuta) {


        for (int i = 0; i < nimiSonum.size(); i++) {
            if (nimiSonum.get(i)[1].equals(kustuta)) {
                nimiSonum.get(i)[1] = "";
            }
        }

    }

    public void prindiToaNimi() {
        System.out.println(toaNimi);

    }
}
