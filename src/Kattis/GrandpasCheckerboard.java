package Done_not_in_git;

import java.util.Scanner;



public class GrandpasCheckerboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean first = true;
        boolean second = true;
        boolean third = true;
        int a = Integer.parseInt(sc.nextLine());

        String[] rows = new String[a];

        for (int i = 0; i < a; i++) {
            rows[i] = sc.nextLine();

        }


        for (int i = 0; i < rows.length; i++) {
            int w = 0;
            int b = 0;
            int con=0;

            String x = rows[i];
         //   System.out.println(x);
            if ((x.indexOf("BBB")==1) || (x.indexOf("WWW")==1)){
                third=false;
                break;
            }
            for (int j = 0; j < x.length(); j++) {
                if (x.charAt(j) == 'B') {
                    b++;
                } else {
                    w++;
                }
            }
            if (b != w ) {
                first = false;
                break;

            }

        }
        for (int i = 0; i < rows.length; i++) {
            int wc = 0;
            int bc = 0;
            int conc=0;

            StringBuilder sb =new StringBuilder("");

            for (int j = 0; j < rows.length; j++) {
                if (rows[j].charAt(i) == 'B') {
                    bc++;
                } else {
                    wc++;
                }
                sb.append(rows[j].charAt(i));

            }
           // System.out.println(sb);
            if ((sb.indexOf("BBB")==1) || (sb.indexOf("WWW")==1)) {
                third=false;
                break;
            }


            if (bc != wc) {
                second = false;
                break;


            }
        }


            if (first && second &&third ) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

