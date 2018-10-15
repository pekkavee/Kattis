package Done;

import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;

public class Kornislav {
    public static void main(String[] args) {
        int number =0;
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        int area;
        sc.close();
        ArrayList<Integer>sides =new ArrayList<>();
        String[]numbers=sentence.split(" ");
        for (int i = 0; i <numbers.length ; i++) {
            sides.add(Integer.parseInt(numbers[i]));
        }
        Collections.sort(sides);
        area=sides.get(0)*sides.get(2);
        System.out.println(area);

    }

}
