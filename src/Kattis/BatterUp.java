package Done;

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int d = 0;
        int x = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <x ; i++) {
            int y = sc.nextInt();
            if (y>=0) {
                sum+=y;
                d++;
            }

        }
        System.out.println((double)sum/d);



    }

}
