package Done_not_in_git;

import java.util.Arrays;
import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[]numbers=sc.nextLine().split(" ");
        sc.close();
        int a = Integer.parseInt(numbers[0]);
        int h = Integer.parseInt(numbers[1]);
        int v = Integer.parseInt(numbers[2]);

        int cake1;
        int cake2;
        int cake3;
        int cake4;
        int thick=4;

        cake1 = h*v*thick;
        cake2 = (a-h)*v*thick;
        cake3 = (a-v)*h*thick;
        cake4 = (a-h)*(a-v)*thick;
        Integer []cakes ={cake1, cake2, cake3, cake4};

        Arrays.sort(cakes);
        System.out.println(cakes[3].toString());





    }
}
