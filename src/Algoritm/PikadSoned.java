package Algoritm;

import java.util.Arrays;

/**
 * Antud on massiiv. Mitu sõne on massiivis keskmisest pikemad?
 */
public class PikadSoned {

    public static void main(String[] args) {

        String[] naide = {"kaalikas", "joonas", "maakera", "homeros", "mandel"}; // vastus on 3

        double koikKarakterid = 0.0;
        int count = 0;


        for (int i = 0; i < naide.length; i++) {
            koikKarakterid = koikKarakterid + naide[i].length();
        }

        for (int j = 0; j <naide.length ; j++) {
            if (naide[j].length() > koikKarakterid / naide.length) {
                count++;
            }
        }

        System.out.println(count);

    }


}
