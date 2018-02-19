package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class YinYan {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        ArrayList<Character> kirjaimetW = new ArrayList<>();
        ArrayList<Character> kirjaimetB = new ArrayList<>();

        for (int i = 0; i <x.length() ; i++) {
            if (x.charAt(i)=='W')
            kirjaimetW.add(x.charAt(i));
            else
                kirjaimetB.add(x.charAt(i));

        }
    if(kirjaimetB.size()==kirjaimetW.size())
        System.out.println(1);
        else System.out.println(0);
        }

    }

