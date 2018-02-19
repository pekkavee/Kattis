package Done;

import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if (a+b==0) {
            System.out.println("Not a moose");
        } else if (a==b) {
            System.out.println("Even "+(a+b));
        } else if (a>b){
            System.out.println("Odd "+(a*2));
        } else if (b>a) {
            System.out.println("Odd "+(b*2));
        }
    }
}
