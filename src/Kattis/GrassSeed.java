package Done;

import java.util.Scanner;

public class GrassSeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int x = sc.nextInt();
        double sum=0;

        for (int i = 0; i <x ; i++) {
            double h = sc.nextDouble();
            double w =sc.nextDouble();
            sum+=h*w;

        }
        sc.close();

        System.out.println(sum*price);

    }
}
