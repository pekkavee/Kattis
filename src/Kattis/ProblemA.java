package Kattis;
import java.util.Scanner;


public class ProblemA {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        String l1 = in.next();
        String l2 = in.next();
        in.close();



        if (x%2==0) {
            if (l1.equals(l2)) {
                System.out.println("Deletion succeeded");
            } else {
                System.out.println("Deletion failed");
            }
        } else {
            String result = "Deletion succeeded";
            for (int i = 0; i < l1.length(); i++) {
                if (l1.charAt(i) == l2.charAt(i)) {
                    result = "Deletion failed";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}