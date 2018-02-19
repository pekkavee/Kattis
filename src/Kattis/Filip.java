package Done;

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder a =new StringBuilder(sc.next());
        StringBuilder b =new StringBuilder(sc.next());
        String at = a.reverse().toString();
        String bt =b.reverse().toString();
        int an =Integer.parseInt(at);
        int bn = Integer.parseInt(bt);

        if (an>bn) {
            System.out.println(an);
        }
        else
            System.out.println(bn);

    }
}
