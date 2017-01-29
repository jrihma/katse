package OOP;

import java.util.ArrayList;

/**
 * Created by jrihma on 25-Jan-17.
 */
public class Kassa {
    ArrayList<String> tsekk = new ArrayList();
    String kassapidaja;
    public Kassa (String kassapidaja){
        this.kassapidaja = kassapidaja;
    }

    public void lisaToode(String toode){
        tsekk.add(toode);

    }
    public void eemaldaToode(String toode){
        for (int i = 0; i < tsekk.size(); i++) {
            if (toode == tsekk.get(i))
                tsekk.remove(i);
        }
    }
    public void prindiOstutsekk(){
        System.out.println(tsekk);
    }
    public void prindiKassapidajaNimi(){
        System.out.println(kassapidaja);
    }
}