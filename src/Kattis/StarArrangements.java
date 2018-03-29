package Kattis.Solved;

import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int s = Integer.parseInt(sc.nextLine());

        System.out.println(s+":");
        int h =2, g =1;

        while (h<=s/2+1) {

            if(h+g>s){
                break;
            }

            if(h==g && s%h==0) {
                System.out.println(h+","+g);
                h++;
                continue;
            }

            else if((s%(h+g))==h || s%(h+g)==0){
                System.out.println(h+","+g);
                if(g<h){
                    g++;
                } else {
                    h++;
                    g=h-1;
                }
                continue;

            } else {
                if(h>g) {
                    g++;
                }else {
                    h++;
                    g=h-1;
                }
            }

        }
    }
}
