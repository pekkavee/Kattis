package Kattis;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Administrator on 13.12.2017.
 */
public class Apaxiaaaaaaaaaaaans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }
        if (string.length() == 1) {
            sb.append(string.charAt(0));
        } else if (charSet.size() == 1) {
            sb.append(string.charAt(0));
        } else if (string.length() > 1) {
            sb.append(string.charAt(0));
            for (int i = 0; i < string.length() - 1; i++) {
                if (string.charAt(i + 1) != string.charAt(i)) {
                    sb.append(string.charAt(i + 1));
                }
            }
            if (sb.length() > 2 && string.charAt(string.length() - 1) != string.charAt(string.length() - 2)) {
                sb.append(string.charAt(string.length() - 1));
            }

        }
        if (sb.length()>1 && sb.charAt(sb.length() - 1) == sb.charAt(sb.length() - 2)) {
            System.out.println(sb.substring(0, sb.length() - 1));
        } else {
            System.out.println(sb.toString());
        }
    }
}