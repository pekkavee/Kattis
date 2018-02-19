package Done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0;


            for (int j = 0; j <4 ; j++) {
                sum1+=sc.nextInt();
            }
            for (int j = 0; j <4 ; j++) {
                sum2+=sc.nextInt();
            }
            for (int j = 0; j <4 ; j++) {
                sum3+=sc.nextInt();
            }
            for (int j = 0; j <4 ; j++) {
                sum4+=sc.nextInt();
            }
            for (int j = 0; j <4 ; j++) {
                sum5+=sc.nextInt();

            }
            sc.close();

        ArrayList<Integer> sums = new ArrayList<Integer>();
        sums.add(sum1);
        sums.add(sum2);
        sums.add(sum3);
        sums.add(sum4);
        sums.add(sum5);

        Integer i = Collections.max(sums);
        System.out.println(sums.indexOf(i)+1+" "+i);

        }
    }

