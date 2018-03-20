package Kattis;

import java.util.Scanner;

public class Herman {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        sc.close();

        double pii=Math.PI;

        double areaCircle1=pii*x*x;
        double areaCircle2=x*x*2;

        System.out.println(areaCircle1);
        System.out.println(areaCircle2);





    }
}
