package Done;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();

        int cases = Integer.parseInt(sc.next());

        for (int i = 0; i <cases ; i++) {

            int x = sc.nextInt();
            lista.add(x);
        }
        for (Integer num:lista) {
            if (num%2==0) {
                System.out.println(num +" is even");
            } else if (num%2!=0) {
                System.out.println(num +" is odd");
            }

        }
    }
}
