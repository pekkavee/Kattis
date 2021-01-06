package Done_not_in_git;

import java.util.Scanner;

public class BeatTheSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases;
        cases = Integer.parseInt(sc.nextLine());
        String impossible = "impossible";

        for (int i = 0; i < cases; i++) {
            String line =sc.nextLine();
            String []scores=line.split(" ");

            int a = Integer.parseInt(scores[0]);
            int b = Integer.parseInt(scores[1]);

            int x;
            int y;


            //x+y=a  x=a-y
            //a-2y=b  y=a+b/2
            // x=a-y



            y = (a + b) / 2;
            x = a - y;
            if (b==0) {
                y=x;
            }
            if (y-x!=b) {
                System.out.println(impossible);
                continue;
            }

          //  if (a-b==1)
           // if (x-y==1 && )
            if (x>=0 && y>=0 ) {
                if (x>y) {
                    System.out.println(x);
                    System.out.println(y);
                } else {
                    System.out.println(y);
                    System.out.println(x);
                }
            } else {
                System.out.println(impossible);
            }


        }
    }
}