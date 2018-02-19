package Done;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int g=1;
        while (true) {


            int d = Integer.parseInt(sc.nextLine());
            if(d==0){
                break;
            }
            ArrayList<String>nimeteka=new ArrayList<>();
            ArrayList<String>nimetoka=new ArrayList<>();

            for (int i = 0; i < d; i++) {
                if (i % 2 == 0) {
                    nimeteka.add(sc.nextLine());
                } else {
                    nimetoka.add(sc.nextLine());

                }
            }



            nimeteka.sort(Comparator.comparing(String::length));
            nimetoka.sort(Comparator.comparing(String::length));




            System.out.println("SET "+g);
            g++;
            for (String aNimeteka : nimeteka) {
                System.out.println(aNimeteka);

            }
            for (int i = nimetoka.size()-1; i >=0 ; i--) {
                System.out.println(nimetoka.get(i));

            }



        }
    }
}
