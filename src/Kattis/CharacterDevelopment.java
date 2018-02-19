package Done;

import java.math.BigInteger;
import java.util.Scanner;

public class CharacterDevelopment {

    static BigInteger tulos2 = BigInteger.valueOf(1);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        relaatiot(x);



    }

    public static BigInteger kertomoa(int luku) {
        tulos2 = BigInteger.valueOf(1);
        for (int i = 1; i <= luku; i++) {
            tulos2 = tulos2.multiply(BigInteger.valueOf(i));


        }

        return tulos2;

    }

    public static void relaatiot(int luku) {
        BigInteger tulos3 = BigInteger.valueOf(0);
        BigInteger tulos4 = BigInteger.valueOf(0);

        for (int i = 0; i < luku-1; i++) {
            if (luku - 2 - i > 0) {

                tulos3 = kertomoa(luku).divide(kertomoa(2+i).multiply(kertomoa(luku-2-i)));
                tulos4=tulos4.add(tulos3);
                tulos3=BigInteger.valueOf(0);

            } else {
                tulos4 =tulos4.add(BigInteger.valueOf(1));

            }

        }
        System.out.println(tulos4);

    }
}

//1 0
//2 1
//3 4
//4 11
//5 26
//6 57
//7 120
//8 247
//9 502
//10 1013
//11 2036
//12 4083
//13 8178
//14 16369  1073741793