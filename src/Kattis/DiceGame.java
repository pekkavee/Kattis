package Done;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
//        ArrayList<Integer>gunnar = new ArrayList<Integer>();
//        ArrayList<Integer>emma = new ArrayList<Integer>();
        int gunnar =0;
        int emma = 0;


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 4 ; i++) {
            gunnar+=sc.nextInt();
        }
        for (int i = 0; i < 4 ; i++) {
            emma+=sc.nextInt();
        }

        if (emma>gunnar) {
            System.out.println("Emma");
        } else if (emma==gunnar) {
            System.out.println("Tie");
        } else {
            System.out.println("Gunnar");
        }
    }
}
