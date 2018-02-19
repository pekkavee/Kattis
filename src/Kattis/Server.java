package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        String[] ab = d.split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        ArrayList<Integer> luvut = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            luvut.add(sc.nextInt());

        }

        int sum = 0;
        int counter = 0;
        for (int i = 0; i <luvut.size() ; i++) {
            sum+=luvut.get(i);
            counter++;
            if (sum==b)
                break;
            if(sum>b) {
                counter--;
                break;
            }

        }
        System.out.println(counter);

    }
}