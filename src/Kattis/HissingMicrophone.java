package Done;

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();

        for (int i = 0; i <x.length() ; i++) {
            if (i==x.length()-1) {
                System.out.println("no hiss");
                break;

            }
           else if(x.charAt(i)=='s' && x.charAt(i+1)=='s') {
                System.out.println("hiss");
                break;
            }

        }

    }
}
