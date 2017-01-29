package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7};
        int number = 0;
        int loendur =0;
        int maxloendur =0;
        int maxnumber=0;
        int[] filtered = Arrays.stream(naide).filter(i -> i != 3).toArray();
        System.out.println(Arrays.toString(filtered));

        for (int i = 0; i < filtered.length; i++) {
            //if (naide[i]!=3){ - kui kolme teist moodi leian
            number = filtered[i];
        //}

            for (int j = i; j < filtered.length; j++) {
                if(number == filtered[j]){
                    loendur++;
                }
            }
            if (loendur>maxloendur){
                maxloendur = loendur;
                maxnumber = number;
            }
            loendur = 0;
        }
        System.out.println("Enim esinenud number on "+maxnumber+", teda esines "+maxloendur+" korda.");

    }

}
