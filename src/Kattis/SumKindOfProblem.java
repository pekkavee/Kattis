package Done;

import java.util.Scanner;

public class SumKindOfProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <x ; i++) {
            String f =sc.nextLine();
            String[]g=f.split(" ");
            int a= Integer.parseInt(g[0]);
            int b= Integer.parseInt(g[1]);
            int eka=0;
            int toka=0;
            toka =b*b;

            int kolmas=0;
            kolmas = 2*b*(b+1)/2;


            for (int j = 1; j <=b ; j++) {
                eka+=j;


            }
            System.out.print(a+" "+eka+" "+toka+" "+kolmas);
            System.out.println();



        }

    }
}
