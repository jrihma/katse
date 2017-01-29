package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 maatriks, millel on kujutatud kikilipsu. Värvitud ala on number 0 ja
 * värvimata on punkt. Kui ei oska siis joonista esiteks rist ja liigu sealt edasi.
 * <p>
 * Näide
 * 0 . . . . . . . 0
 * 0 0 . . . . . 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 0 0 0 0 0 0
 * 0 0 0 0 . 0 0 0 0
 * 0 0 0 . . . 0 0 0
 * 0 0 . . . . . 0 0
 * 0 . . . . . . . 0
 */
public class Kikilips {

    // Lihtsalt abiline meetod, et maatriksit välja printida
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.println();
            }

        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i >= j && i + j < 9) || (i <= j && i + j >= 8)) {
                    System.out.println("0");
                } else{
                    System.out.println("-");
                }
            }


            System.out.println("");
        }
    }
}