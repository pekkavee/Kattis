package Kattis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Synchronizinglists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            int x = Integer.parseInt(sc.nextLine());
            if(x==0)
                break;

            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();


            for (int i = 0; i < x; i++) {
                list1.add(Integer.valueOf(sc.nextLine()));

            }
            for (int i = 0; i < x; i++) {
                list2.add(Integer.valueOf(sc.nextLine()));

            }

            ArrayList<Integer> ordered1 = new ArrayList<>(list1);
            Collections.sort(ordered1);
            ArrayList<Integer> ordered2 = new ArrayList<>(list2);
            Collections.sort(ordered2);

            for (int i = 0; i < list1.size(); i++) {
                int first = list1.get(i);
                int place = ordered1.indexOf(first);
                System.out.println(ordered2.get(place));

            }
            System.out.println();

        }
    }
}