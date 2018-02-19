package Done;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int x = Integer.parseInt(sc.nextLine());
       sc.close();

        int sum = 0;
        ArrayList<Integer> y = new ArrayList<>();

        while(x>0) {
            y.add(x%2);
            x=x/2;

        }
        Collections.reverse(y);


        for (int i = 0; i <y.size() ; i++) {
            sum+=y.get(i)*Math.pow(2, i);



        }
        System.out.println(sum);


    }
}
