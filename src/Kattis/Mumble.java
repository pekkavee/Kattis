package Done;

import java.util.Scanner;

public class Mumble {
    public static void main(String[] args) {
        int number =0;
        String makesSense="makes sense";
        Scanner sc = new Scanner(System.in);
        int u = Integer.parseInt(sc.nextLine());
        String sentence = sc.nextLine();
        sc.close();
        String[]numbers=sentence.split(" ");
        for (String x: numbers) {
            number++;
            if (x.equals(String.valueOf(number)) || x.equals("mumble")) {
                continue;

            } else {
                makesSense="something is fishy";
                break;
            }
        }
        System.out.println(makesSense);

    }

}
