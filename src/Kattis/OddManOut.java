package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class OddManOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        ArrayList<ArrayList<Integer>> dsa = new ArrayList<>();





        for (int i = 0; i < cases; i++) {
            long result = 0;
            int d = sc.nextInt();
            ArrayList<Integer> vieraat = new ArrayList<>();
            ArrayList<Integer> v = new ArrayList<>();
            for (int j = 0; j < d; j++) {
           int sdd = sc.nextInt();
           vieraat.add(sdd);
            }
            for (int j = 0; j <vieraat.size(); j++) {
                vieraat.get(j);
                if(!v.contains(vieraat.get(j))){
                    v.add(vieraat.get(j));
                    result+=vieraat.get(j);
                }else {
                    result-=vieraat.get(j);
                }

            }
            System.out.println("Case #"+(i+1)+": "+result);
            result=0;
        }

    }
}
//3
//        3
//        1 2147483647 2147483647
//        5
//        3 4 7 4 3
//        5
//        2 10 2 10 5