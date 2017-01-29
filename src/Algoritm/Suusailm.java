package Algoritm;

/**
 * Antud on kaks massiivi õhu temperatuuridega. Arvuta mõlema puhul mitu positiivset temperatuuri
 * on massiivis rohkem kui negatiivseid.
 */
public class Suusailm {
    public static void main(String[] args) {
        int[] kraadid1 = {11, 10, 5, 1, 3, -2, -6, 2, -13, -24, -9, 0};
        int[] kraadid2 = {-23, -25, -22, -18, -15, -19, -13};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;

        for (int i = 0; i < kraadid1.length; i++) {
            if (kraadid1[i] < 0) {
                count1++;
            } else if (kraadid1[i] > 0) {
                count2++;
            }

        }
        for (int i = 0; i < kraadid2.length; i++) {
            if (kraadid2[i] < 0) {
                count3++;
            } else if (kraadid2[i] > 0) {
                count4++;
            }

        }

        if (count2 - count1 < 0) {
            System.out.println(0);
        } else {
            System.out.println(count2 - count1);
        }
        if (count4 - count3 < 0) {
            System.out.println(0);
        } else {
            System.out.println(count4 - count3);
        }

    }
}
