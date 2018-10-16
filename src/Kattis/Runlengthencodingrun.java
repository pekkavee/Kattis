package Done;

import java.util.Scanner;

public class Runlengthencodingrun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        char a = x.charAt(0);

        StringBuilder sb = new StringBuilder(x.substring(2));
        char b = sb.charAt(0);
        sb.deleteCharAt(0);

        if (a == 'E') {

            int t = 1;


            for (int i = 0; i < sb.length(); ) {
                char c=sb.charAt(0);

                if (b == c) {
                    sb.deleteCharAt(0);
                    t++;
                } else {
                    System.out.print(b + "" + t);

                    b=sb.charAt(0);
                    sb.deleteCharAt(0);
                    t=1;


                }
            }
            System.out.print(b+""+t);

        } else {
            for (int j = 0; j <sb.length() ; ) {

                int h = Character.getNumericValue(sb.charAt(0));
                sb.deleteCharAt(0);
                for (int i = 0; i < h; i++) {
                    System.out.print(b);

                }
                if (sb.length()>0) {
                    b = sb.charAt(0);
                    sb.deleteCharAt(0);
                }
        }



        }
    }
}
