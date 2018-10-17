package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class MixedFractions {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        ArrayList<String> numbers = new ArrayList<>();

        while (true) {
            String o = sc.nextLine();
            if(o.equals("0 0")) {
                break;
            }
            numbers.add(o);

        }

        for (String g:numbers) {
            String[]f=g.split(" ");
            int a = Integer.parseInt(f[0]);
            int b = Integer.parseInt(f[1]);
            int u = a / b;
            int x = a - (u * b);
            System.out.println(u+" "+x+" / "+b);

        }

    }
}
