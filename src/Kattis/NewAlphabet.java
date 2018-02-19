package Done;

import java.util.*;

public class NewAlphabet {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<String, String>();

        dictionary.put("a", "@");
        dictionary.put("b", "8");
        dictionary.put("c", "(");
        dictionary.put("d", "|)");
        dictionary.put("e", "3");
        dictionary.put("f", "#");
        dictionary.put("g", "6");
        dictionary.put("h", "[-]");
        dictionary.put("i", "|");
        dictionary.put("j", "_|");
        dictionary.put("k", "|<");
        dictionary.put("l", "1");
        dictionary.put("m", "[]\\/[]");

        dictionary.put("n", "[]\\[]");
        dictionary.put("o", "0");
        dictionary.put("p", "|D");
        dictionary.put("q", "(,)");
        dictionary.put("r", "|Z");
        dictionary.put("s", "$");
        dictionary.put("t", "']['");
        dictionary.put("u", "|_|");
        dictionary.put("v", "\\/");
        dictionary.put("w", "\\/\\/");
        dictionary.put("x", "}{");
        dictionary.put("y", "`/");
        dictionary.put("z", "2");


        Scanner sc = new Scanner(System.in);




        String lause2 = sc.nextLine();
        sc.close();
       String lause= lause2.toLowerCase();
        for (int i = 0; i < lause.length(); i++) {
            if (dictionary.get(lause.substring(i, i + 1)) == null) {
                System.out.print(lause.substring(i, i + 1));
            } else {
                System.out.print(dictionary.get(lause.substring(i, i + 1)));


            }
        }
    }
}






