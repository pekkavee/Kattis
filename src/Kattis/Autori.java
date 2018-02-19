package Done;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String x = in.nextLine();

        in.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <x.length() ; i++) {
            if(Character.isUpperCase(x.charAt(i))) {
                sb.append(x.charAt(i));
            }

        }
        System.out.println(sb.toString());

    }
}


