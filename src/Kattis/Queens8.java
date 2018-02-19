package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class Queens8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> rivit = new ArrayList<>();
        String result = "valid";
        for (int i = 0; i < 8; i++) {
            String x = sc.next();
            rivit.add(x);

        }
        for (int i = 0; i < rivit.size(); i++) {
            String f = rivit.get(i);
            if (f.contains("*")) {
                int d = rivit.get(i).indexOf("*");

                int u = 1;
                for (int j = i + 1; j < rivit.size(); j++) {
                    int o = rivit.get(j).indexOf("*");
                    if (o == d || o == (d - u) || o == (d + u)) {
                        result = "invalid";
                    }
                    u++;
                }

            } else {
                result = "invalid";
                break;
            }

        }
        System.out.println(result);
    }
}
// 0,6,4,7,1,3,5,2