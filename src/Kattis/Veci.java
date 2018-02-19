package Done;


import java.util.*;

public class Veci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int y = Integer.parseInt(x);
        sc.close();

        boolean status = true;

        while (true) {
            y++;
            String z = String.valueOf(y);
            if (z.length()>x.length()) {
                System.out.println("0");
                break;
            }


            char[] s1Array = z.toLowerCase().toCharArray();
            char[] s2Array = x.toLowerCase().toCharArray();


            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array, s2Array);
            if (status==true) {
                System.out.println(y);
                break;
            }
        }
    }
}


