package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String b = null;


        int a = Integer.parseInt(sc.nextLine());

        ArrayList<Integer>l=new ArrayList<>(a);

        for (int i = 0; i <a ; i++) {
            l.add(Integer.parseInt(sc.nextLine()));

        }
        sc.close();

        int sum =1;

        for (int i = 0; i <a ; i++) {
            int x=l.get(i);

            for (int j = 0; j <l.get(i) ; j++) {
                sum=sum*x;
                x--;

            }

            b=String.valueOf(sum);
            System.out.println(b.charAt(b.length() - 1));
            sum=1;



        }

        }
}
