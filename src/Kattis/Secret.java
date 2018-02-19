package Done;

import java.util.Scanner;

public class Secret {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        sc.close();
        String per = "per";
        int days=0;
        for (int i = 0; i <x.length() ; i+=3) {
            String o = x.substring(i,i+3);
            for (int j = 0; j <o.length() ; j++) {
                char g = o.toLowerCase().charAt(j);
                if(g==per.toLowerCase().charAt(j)){
                    continue;
                }else {
                    days++;
                }

            }


        }
        System.out.println(days);

    }
}
