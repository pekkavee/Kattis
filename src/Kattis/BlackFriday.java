package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(x);

        int biggest = -1;

        for (int i = 0; i < x; i++) {
            numbers.add(sc.nextInt());

        }

        for (int i = 0; i < numbers.size(); i++) {
            int y = numbers.get(i);
            int count=0;

            for (Integer number : numbers) {
                if (y == number) {
                    count++;
                }


            }
            if (count==1 && y>biggest) {
                biggest=y;

            }

        }
        if (biggest!=-1) {
            System.out.println(numbers.indexOf(biggest) + 1);
        } else {
            System.out.println("none");
        }



    }
}
