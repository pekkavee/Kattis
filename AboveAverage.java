package Kattis;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AboveAverage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = Integer.parseInt(sc.nextLine());

        while(x>0){
            x--;
            int y = sc.nextInt();
            int sum =0;
            ArrayList<Integer>students=new ArrayList<>();
            for (int j = 0; j <y ; j++) {
                int grade = sc.nextInt();
                students.add(grade);
                sum+=grade;
            }
            double average =(double)sum/students.size();
            int u =0;
            for (int j = 0; j <students.size() ; j++) {
                if(students.get(j)>average){
                    u++;
                }

            }
            DecimalFormat df2 = new DecimalFormat( "0.000" );
            Double percentage =(double)u/students.size()*100;
            System.out.println(df2.format(percentage)+"%");














        }

    }
}
