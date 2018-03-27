package Kattis.Solved;

import java.util.ArrayList;
import java.util.Collections;
import java.util.RandomAccess;
import java.util.Scanner;

public class CookingWater {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>alkuajat=new ArrayList<>();
        ArrayList<Integer>loppuajat=new ArrayList<>();
        int x =sc.nextInt();
        for (int i = 0; i <x ; i++) {
            alkuajat.add(sc.nextInt());
            loppuajat.add(sc.nextInt());

        }



        Collections.sort(alkuajat);
        Collections.sort(loppuajat);

        if(alkuajat.get(alkuajat.size()-1)>loppuajat.get(0)){
            System.out.println("edward is right");
        } else {
            System.out.println("gunilla has a point");

        }

    }
}
