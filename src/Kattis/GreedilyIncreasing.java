package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class GreedilyIncreasing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        ArrayList<Integer>ar =new ArrayList<>(a);
        for (int i = 0; i <a ; i++) {
            int u = Integer.parseInt(sc.next());
            ar.add(u);

        }

        int s =ar.get(0);
        StringBuilder sb =new StringBuilder(String.valueOf(s)+" ");

        int u =1;

        for (int i = 1; i <ar.size() ; i++) {
            if(ar.get(i)>s){
                sb.append(String.valueOf(ar.get(i))+" ");

                s=ar.get(i);
                u++;
            } else{
                continue;
            }




        }
        System.out.println(u);
        System.out.println(sb);
    }
}
