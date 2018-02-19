package Done;

import java.util.Scanner;

public class Kemija {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String x = in.nextLine();

        StringBuilder sb = new StringBuilder(x);

        for (int i = 0; i < sb.length()-1 ; i++) {
            String z=Character.toString(sb.charAt(i));
            if(z.matches("[aeiouy]")) {
                sb.replace((i+1),(i+3),"");

            }

        }
        System.out.println(sb.toString());

    }
}

