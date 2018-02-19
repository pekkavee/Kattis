package Done;

import java.util.Arrays;
import java.util.Scanner;

public class Tajna {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String lause =sc.nextLine();

        int u =lause.length();
       int x=1;
       int y=u;
       int eka=0;
       int toka=0;

        while(true){
            if(x*y==u){
                eka=x;
                toka=y;
            } x++;
            y=u/x;
            if(x>y){
                break;
            }


        }

        String[][]t=new String[toka][eka];
        int l=0;
        for (int i = 0; i <toka ; i++) {
            for (int j = 0; j <eka ; j++) {
                t[i][j]= String.valueOf(lause.charAt(l));
                l++;

            }

        }

        StringBuilder sb =new StringBuilder();
        for (int i = 0; i <eka ; i++) {
            for (int j = 0; j <toka ; j++) {
                sb.append(t[j][i]);

            }

        }
        System.out.println(sb);
        }
}
