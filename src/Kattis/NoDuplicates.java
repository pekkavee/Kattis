package Done;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.nextLine();
        sc.close();

        noDuplicates(x);

    }
    public static void noDuplicates (String sentence) {
        String[] array = sentence.split(" ");
        int end = array.length;
        Set<String> set = new HashSet<String>();

        for(int i = 0; i < end; i++){
            set.add(array[i]);
        }
        if(set.size()<array.length) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
