package Done;

import java.util.*;

public class CompoundWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> words2 = new ArrayList<>();
//words2.add("moi");
//words2.add("hei");
//words2.add("dssa");


        while (sc.hasNextLine()) {
            String lause = sc.nextLine();
            if (!lause.isEmpty()) {
                String[] s=lause.split(" ");
                for (int i = 0; i <s.length ; i++) {
                    words2.add(s[i]);

                }

            } else {

                break;
            }
        }
        for (int i = 0; i <words2.size(); i++) {
            for (int j = 0; j <words2.size() ; j++) {
                StringBuilder sb = new StringBuilder(words2.get(i));

                if(!words2.get(i).equals(words2.get(j))) {
                   String x = String.valueOf(sb.append(words2.get(j)));
                   words.add(x);

            }


        }

        }
        Set<String> o = new HashSet<>();
        o.addAll(words);
        words.clear();
        words.addAll(o);
        Collections.sort(words);

        for (String s:words
             ) {
            System.out.println(s);
        }
    }
}
