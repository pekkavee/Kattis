package Done;

import java.util.Scanner;

public class Life {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int g = Integer.parseInt(sc.nextLine());
        double life =0;

        for (int i = 0; i <g ; i++) {
            String x = sc.nextLine();
            String[]y=x.split(" ");
            double a = Double.parseDouble(y[0])*Double.parseDouble(y[1]);
            life=life+a;
        }

        System.out.println(life);

    }
}
