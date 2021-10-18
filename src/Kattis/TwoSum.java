package Kattis;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String line = sc.nextLine();
        String [] numbers = line.split(" ");
        int numOne = Integer.parseInt(numbers[0]);
        int numTwo = Integer.parseInt(numbers[1]);
        int sum = numOne+numTwo;
        System.out.println(sum);
    }

}
