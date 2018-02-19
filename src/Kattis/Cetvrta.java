package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            aa.add(a);
            bb.add(b);
        }

        int y =aa.get(0);
        for (int i = 0; i < aa.size(); i++) {
            int f = aa.get(0);
            aa.remove(aa.get(0));

            for (int j = 0; j < aa.size(); j++) {
                if (aa.get(j).equals(f)) {
                    aa.remove(aa.get(j));
                }


            }
            if (aa.size()==0){
                aa.add(y);
            }


        }
        for (int aaaa : aa
                ) {
            System.out.print(aaaa+" ");

        }
        int r = bb.get(0);
        for (int i = 0; i < bb.size(); i++) {
            int g = bb.get(0);
            bb.remove(bb.get(0));

            for (int j = 0; j < bb.size(); j++) {
                if (bb.get(j).equals(g)) {
                    bb.remove(bb.get(j));
                }


            }
            if (bb.size()==0){
                bb.add(r);
            }


        }
        for (int bbbb : bb
                ) {
            System.out.print(bbbb);

        }

    }
}
