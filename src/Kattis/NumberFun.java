package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<String>numerot = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            String y=sc.nextLine();
            numerot.add(y);

        }

        for (int i = 0; i <numerot.size(); i++) {
            String p = numerot.get(i);

            String[]n=p.split(" ");
            String eka = n[0];
            String toka = n[1];
            String kolmas = n[2];
            int a = Integer.parseInt(eka);
            int b = Integer.parseInt(toka);
            int c = Integer.parseInt(kolmas);


            if(a+b==c || a-b==c || a/b==c && a%b==0 || a*b==c) {
                System.out.println("Possible");
            }else if(b+a==c || b-a==c || b/a==c && b%a==0 || b*a==c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }




        }




    }
}
