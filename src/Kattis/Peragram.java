package Done;

import java.util.*;

public class Peragram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        laske();

    }

    public static void laske() {
        String word = sc.nextLine();
        sc.close();


        ArrayList<Integer> parittomat = new ArrayList<>();
        StringBuilder sb = new StringBuilder(word);


        ArrayList<Character> merkit = new ArrayList<>();

        for (int i = 0; i < sb.length(); i++) {
            if (!merkit.contains(sb.charAt(i))) {
                merkit.add(sb.charAt(i));

            }

        }

        int tulos = 0;

        for (int i = 0; i < merkit.size(); i++) {
            char x = merkit.get(i);
            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == x) {
                    tulos++;
                }

            }

            if (tulos % 2 != 0) {
                parittomat.add(tulos);
            }
            tulos = 0;

        }

        Collections.sort(parittomat);
        int parSum = 0;
        for (int i = 0; i <parittomat.size() ; i++) {
            parSum+=parittomat.get(i);

        }
        if (parittomat.size()==0 ||parittomat.size()==1) {
            System.out.println("0");
        } else if (parittomat.size()==2) {
            System.out.println("1");
        } else if (parittomat.size()>=3) {
            int a=(parSum-parittomat.get(parittomat.size()-1)-parittomat.get(parittomat.size()-2)+1);
           int n=(parittomat.size()-1);
           if (a>=n) {
               System.out.println(n);
           } else {
               System.out.println(a);
           }
        }

    }

}