package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Yoda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            aa.add(Integer.parseInt(a.substring(i, i + 1)));
        }
        for (int i = 0; i < b.length(); i++) {
            bb.add(Integer.parseInt(b.substring(i, i + 1)));
        }

        StringBuilder aaa = new StringBuilder();
        StringBuilder bbb = new StringBuilder();
        int size;
        if (a.length() > b.length()) {
            size = b.length();
        } else {
            size = a.length();
        }

        for (int i = 1; i <= size; i++) {

            if (aa.get(aa.size() - i) > bb.get(bb.size() - i)) {
                aaa.append(aa.get(aa.size() - i));
            } else if (aa.get(aa.size() - i) < bb.get(bb.size() - i)) {
                bbb.append(bb.get(bb.size() - i));

            } else if (aa.get(aa.size() - i) == bb.get(bb.size() - i)) {
                bbb.append(bb.get(bb.size() - i));
                aaa.append(aa.get(aa.size() - i));

            }

        }

        if (a.length() > b.length()) {
            int k = a.length() - b.length();
            for (int i = 1; i <= k; i++) {
                aaa.append(aa.get(k - i));

            }
        } else if (b.length() > a.length()) {
            int l = b.length() - a.length();
            for (int i = 1; i <= l; i++) {
                bbb.append(bb.get(l - i));
            }
        }


        if (aaa.length() == 0) {
            System.out.println("YODA");
        }else if (aaa.charAt(aaa.length()-1)=='0') {
            System.out.println("0");
        } else {
            System.out.println(aaa.reverse().toString());
        }
        if (bbb.length() == 0) {
            System.out.println("YODA");
        } else if (bbb.charAt(bbb.length()-1)=='0') {
                System.out.println("0");
            }
         else {
            System.out.println(bbb.reverse().toString());
        }
    }
}


