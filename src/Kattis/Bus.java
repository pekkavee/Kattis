package Done_not_in_git;

import java.util.Scanner;

public class Bus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());

        double passengers = 0;

        for (int i = 0; i <a; i++) {

            int b =Integer.parseInt(sc.nextLine());



            for (int j = 0; j < b; j++) {
                passengers = 2 * (passengers + 0.5);


            }
            System.out.println((int) passengers);
            passengers=0;
        }
    }
}
