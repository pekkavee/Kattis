package Done;

import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int tulos = sc.nextInt();

        if (a+b==tulos){
            System.out.println(a+"+"+b+"="+tulos);
        }else if (a-b==tulos) {
            System.out.println(a+"-"+b+"="+tulos);
        }else if (a/b==tulos) {
            System.out.println(a+"/"+b+"="+tulos);
        }else if (a*b==tulos) {
            System.out.println(a+"*"+b+"="+tulos);
        } else if (a==b+tulos) {
            System.out.println(a + "=" + b + "+" + tulos);
        }else if(a==b-tulos) {
            System.out.println(a+"="+b+"-"+tulos);
        } else if (a==b/tulos) {
            System.out.println(a+"="+b+"/"+tulos);
        } else if (a==b*tulos) {
            System.out.println(a+"="+b+"*"+tulos);
        }

    }
}
