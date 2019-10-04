package Done;

import java.util.Scanner;

public class Halloween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String o =sc.nextLine();
        String oct = "OCT";
        String dec = "DEC";
        String numo= "31";
        String numd= "25";

        String[]numbers =o.split(" ");
        String eka = numbers[0];
        String toka= numbers[1];
        if ((eka.equals(oct) && toka.equals(numo)) || (eka.equals(dec) && toka.equals(numd)) ) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
    }
}