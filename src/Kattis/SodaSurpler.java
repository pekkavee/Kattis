package Done;

import java.util.Scanner;

public class SodaSurpler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        sc.close();
        int bottles = x+y;
        int drunk = 0;
        int sum = 0;



        while (bottles >=z) {
            drunk = bottles/z;
            int remainder = bottles%z;
            bottles = drunk+remainder;
            sum += drunk;


        }
        System.out.println(sum);



        }
    }

