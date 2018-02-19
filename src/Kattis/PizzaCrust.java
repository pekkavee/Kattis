package Done;

import java.util.Scanner;

public class PizzaCrust {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();

        double pizza = x*x*Math.PI;
        double cheeseArea=(x-y)*(x-y)*Math.PI;


        System.out.println(cheeseArea/pizza*100);

    }
}
