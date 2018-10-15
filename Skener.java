package Done;

import java.util.ArrayList;
import java.util.Scanner;


public class Skener {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String firstLine = sc.nextLine();
    String[]numbers =firstLine.split(" ");



    int rows =Integer.parseInt(numbers[0]);
    int columns =Integer.parseInt(numbers[1]);
    int zR = Integer.parseInt(numbers[2]);
    int zC = Integer.parseInt(numbers[3]);
    ArrayList<String>texts =new ArrayList<>(rows);

    for (int i = 0; i <rows ; i++) {
        texts.add(sc.nextLine());
    }

    for (String x:texts) {
        for (int p = 0; p <zR; p++) {
            for (int i = 0; i < x.length(); i++) {
                char c = x.charAt(i);
                for (int j = 0; j < zC; j++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }
    }
}








