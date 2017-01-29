package OOP;

/**
 * Created by jrihma on 25-Jan-17.
 */
public class Korter {
    int mahutab;
    int loendur = 0;
    public Korter(int inimesiMahutab){
        mahutab=inimesiMahutab;
    }
    public void saabus(String taavi) {
        String kylaline = new String();


        if (mahutab>0&&loendur<mahutab) {
            loendur++;
        }




    }

    public void prindiKylalisteArv() {
        System.out.println(loendur);
        System.out.println("");
    }


    public void prindiPaljuVeelMahub() {
        System.out.println("mahub veel " + (mahutab-loendur)+ " inimest");
    }

    public void lahkus(String taavi) {
        if(mahutab>0){
            loendur--;
        }

    }
}
