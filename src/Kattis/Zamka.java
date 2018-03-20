package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        ArrayList<Integer>luvut=new ArrayList<>();

        for (int i = a; i <= b; i++) {



            int sum = 0;
            int luku=0;
            String x = String.valueOf(i);
            for (int j = 0; j < x.length(); j++) {
                sum+=Integer.parseInt(x.substring(j, j+1));
                luku=Integer.parseInt(x);

            }
            if(sum==c)
            luvut.add(luku);


        }
        System.out.println(luvut.get(0));
        System.out.println(luvut.get(luvut.size()-1));


        }
    }

