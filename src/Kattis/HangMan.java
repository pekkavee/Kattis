package Kattis;

import java.util.HashSet;
import java.util.Scanner;


public class HangMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hangMan=10;
        HashSet<Character> chars = new HashSet<>();
        String word = sc.nextLine();
        String letters = sc.nextLine();
        boolean result = true;

        for (int i = 0; i < word.length(); i++) {
            char x = word.charAt(i);
            chars.add(x);

        }

        for (int i = 0; i < letters.length() ; i++) {
            char x = letters.charAt(i);
            if (chars.contains(x)) {
                chars.remove(x);
            } else {
                hangMan--;
            }

            if (chars.isEmpty()) {
                break;
            }

            if (hangMan==0) {
                result=false;
                break;
            }

        }
        if (result) {
            System.out.println("Win");
        } else {
            System.out.println("Lose");
        }

}}
