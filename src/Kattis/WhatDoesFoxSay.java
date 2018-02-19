package Done;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WhatDoesFoxSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());


        for (int g = 0; g < x; g++) {
            ArrayList<String> animals = new ArrayList<>();
            ArrayList<String> words = new ArrayList<>();


            while (sc.hasNextLine()) {

                String k = sc.nextLine();
                if (k.contains("what does the fox say")) {
                    break;
                }
                if (k.contains("goes")) {
                    String[] sound = k.split(" ");
                    animals.add(sound[2]);

                } else {
                    String[] word = k.split(" ");
                    words.addAll(Arrays.asList(word));

                }
            }


            for (String animal : animals
                    ) {
                for (int i = 0; i < words.size(); i++) {
                    String word = words.get(i);
                    if (word.equals(animal)) {
                        words.remove(words.get(i));
                        i--;
                    }

                }

            }
            for (String word:words
                 ) {
                System.out.print(word+" ");

            }
        }
    }
}

