package Done;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BabelFish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        HashMap<String, String> hmap = new HashMap<String, String>();
        while (sc.hasNextLine()) {
            String x = sc.nextLine();
            if (x.isEmpty()) {
                break;
            } else {
                String[] p = x.split(" ");
                hmap.put(p[1], p[0]);
            }

        }
        while (sc.hasNextLine()) {
            String y = sc.nextLine();
            if (y.isEmpty()) {
                break;
            } else {
                words.add(y);
            }

        }
        sc.close();


        for (int i = 0; i < words.size(); i++) {
            String p = words.get(i);
            String d = hmap.get(p);
            if(d != null && !d.isEmpty()) {
                System.out.println(d);
            }else{
                System.out.println("eh");
            }

        }
    }
}
