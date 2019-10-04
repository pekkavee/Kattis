package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Avion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> z=new ArrayList<>(5);
        StringBuilder sb = new StringBuilder();

        String FBI = "FBI";
        String away= "HE GOT AWAY!";

        boolean isfound = false;




        for (int i = 0; i <5 ; i++) {
            z.add(sc.nextLine());
        }

        for (int i = 0; i <5 ; i++) {
            isfound = z.get(i).contains(FBI);

            if (isfound==true) {

                sb.append(String.valueOf((i+1)));
                sb.append(" ");
            }

        }
        if(sb.length()>0) {
            System.out.println(String.valueOf(sb).trim());
        } else {
            System.out.println(away);
        }

    }
}
