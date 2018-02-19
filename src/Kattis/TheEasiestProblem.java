package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class TheEasiestProblem {
    public static void main(String[] args) {
        ArrayList<String>luvut=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String p =sc.nextLine();
            if (p.equals("0")){
                break;
            }else {
                luvut.add(p);
            }
        }
        for (String aLuvut : luvut) {
            laske(aLuvut);

        }


    }

    private static void laske(String x) {
        int sum =0;
        for (int i = 0; i <x.length() ; i++) {
            sum+=Integer.parseInt(String.valueOf(x.charAt(i)));

        }

        int j =11;

        while (true) {
            int s=j*Integer.parseInt(x);
            String d = String.valueOf(s);
            int su=0;
            for (int i = 0; i <d.length() ; i++) {
                su+=Integer.parseInt(String.valueOf(d.charAt(i)));

            }
            if (su==sum) {
                System.out.println(j);
                break;
            }
            j++;



        }

    }
}
