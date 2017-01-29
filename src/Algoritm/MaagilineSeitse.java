package Algoritm;

/**
 * Antud on int[] massiiv. Korruta kõik seitsmed kahega ja leia arvude keskmine.
 */
public class MaagilineSeitse {

    public static void main(String[] args) {

        int[] naide = {7, 4, 324, 65, 4, 78, 7, 45, 4};
        double summa = 0.0;

        double mituArvuOn = 0.0;
        mituArvuOn = naide.length;
        //System.out.println(mituArvuOn);

        for (int i = 0; i < naide.length; i++) {
            if (naide[i] == 7) {
                naide[i] = naide[i] * 2;
            }
            summa = summa + naide[i];


        }
        double keskmine = 0;
        keskmine = summa / mituArvuOn;

        System.out.println(Math.round(keskmine * 10) / 10.0);

    }

}
