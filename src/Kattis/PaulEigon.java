package Done;

import java.util.Scanner;

public class PaulEigon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int p = sc.nextInt();
        int o = sc.nextInt();
        int po = p+o;
        int x = po/s;
        sc.close();

        if ((p+o)<s) {
            System.out.println("paul");
        }
        else if (x%2==0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }
}
