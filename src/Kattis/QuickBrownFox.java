package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class QuickBrownFox {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        char[] alpha = new char[26];
        ArrayList<String> sanat = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < 26; i++) {
            alpha[i] = (char) (97 + (k++));
        }

        for (int i = 0; i < x; i++) {
            String d = sc.nextLine().toLowerCase();
            sanat.add(d);


        }


        int p = 0;
        ArrayList<String> puuttuvat = new ArrayList<>();

        for (int i = 0; i < sanat.size(); i++) {
            String e = sanat.get(i);

            for (int j = 0; j < alpha.length; j++) {
                String abc = String.valueOf(alpha[j]);

                if (e.contains(abc)) {
                    continue;
                }else {
                    puuttuvat.add(abc);
                }


            }
            if (puuttuvat.size()==0) {
                System.out.println("pangram");
            } else{
                System.out.print("missing ");
                for (String puuttuva:puuttuvat
                        ) {
                    System.out.print(puuttuva);
                }
                System.out.println();
            }
            puuttuvat.clear();
        }
    }
}