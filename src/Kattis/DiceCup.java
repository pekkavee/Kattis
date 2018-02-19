package Done;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;


        try (Scanner sc = new Scanner(System.in)) {
            a = sc.nextInt();
            b = sc.nextInt();


        } catch (InputMismatchException e) {
            System.out.println("ei lukuarvo");
        }

        if (a==b) {
            System.out.println(a+1);
        }
        else if (a< b) {
            for (int i =a+1 ; i <=b+1 ; i++) {
                System.out.println(i);

            }
        }
        else if (b<a) {
            for (int i = b+1; i <=a+1 ; i++) {
                System.out.println(i);

            }
        }
    }


}
