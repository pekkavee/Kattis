package Done;

import java.util.Scanner;

public class Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d = Double.parseDouble(sc.nextLine());

        double a = d*1000*5280/4854;
        int b = (int)Math.round(a);
        System.out.println(b);

    }
}
