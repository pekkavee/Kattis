package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IHaveBeenEveryWhere {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int x = Integer.parseInt(br.readLine());

        for (int i = 0; i <x ; i++) {
            int y = Integer.parseInt(br.readLine());
            Set<String> kaupungit = new HashSet<>();
            for (int j = 0; j <y ; j++) {
                kaupungit.add(br.readLine());

            }
            System.out.println(kaupungit.size());
            
        }
        }

    }

