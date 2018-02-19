package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());
        ArrayList<String>luku = new ArrayList<>();

        for (int i = 0; i <x; i++) {
            luku.add(sc.nextLine());
        }

        for (int i = 0; i <luku.size() ; i++) {



            String[] luvut = luku.get(i).split(" ");
            int a = Integer.parseInt(luvut[0]); //do not advertise
            int b = Integer.parseInt(luvut[1]); // do advertise
            int c = Integer.parseInt(luvut[2]); //costs

            if (b-a>c) {
                System.out.println("advertise");
            } else if (b-a==c) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }


        }
    }
}
