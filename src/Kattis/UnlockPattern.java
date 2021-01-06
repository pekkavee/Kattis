package Done_not_in_git;

import java.util.Scanner;

public class UnlockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []a=new String[10];

        double distance =0;




        for (int i = 0; i <3 ; i++) {
            String x=sc.nextLine();
            String []b=x.split(" ");

            for (int j = 0; j <b.length ; j++) {

                StringBuilder sb = new StringBuilder();
                sb.append(b[j]);
                sb.append(j);
                sb.append(i);
                a[Integer.parseInt(b[j])]= String.valueOf(sb);


            }

        }

        for (int i = 2; i <a.length ; i++) {
            //System.out.println(a[i-1]);
        //    System.out.println(a[i]);
            String g = a[i-1];
            String y = a[i];
            double x1 = Double.parseDouble(g.substring(1,2));
            double x2 = Double.parseDouble(y.substring(1,2));
        //    System.out.println(x1);
        //    System.out.println(x2);
            double y1 = Double.parseDouble(g.substring(2,3));
            double y2 = Double.parseDouble(y.substring(2,3));

            double xerotus = Math.abs(x1-x2);
            double yerotus = Math.abs(y1-y2);

            if ((xerotus == 0.0) || (yerotus == 0.0)) {
                distance=distance+xerotus+yerotus;
            }

            else {
              distance=distance+ Math.sqrt(xerotus*xerotus+yerotus*yerotus);

            }


        }
        System.out.println(distance);



    }
}