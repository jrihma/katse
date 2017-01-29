package OOP;

/**
 * Created by jrihma on 25-Jan-17.
 */
public class Zelda {
    int elusid;

    public Zelda(int zeldaElud) {
        elusid = zeldaElud;


    }

    public void kaklusKolliga(int kollilElusid) {
        elusid = elusid - kollilElusid;
    }


    public void prindiMituEluAlles() {
        System.out.println(elusid + " elu alles");
    }




    public void prindiKasOnElus() {
        if (elusid >0) {
            System.out.println("elus");
        }
            else{
                System.out.println("surnud");
            }
        System.out.println(elusid + " elu alles");


    }

}