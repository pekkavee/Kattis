package Done_not_in_git;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FreeFood {
    public static void main(String[] args) {
        Set<Integer> freeFood = new HashSet<Integer>();
        Scanner sc =new Scanner(System.in);


        int a = Integer.parseInt(sc.nextLine());
        String [] days = new String[a];

        for (int i = 0; i <a ; i++) {
            days[i]=sc.nextLine();

        }

        for (int i = 0; i <days.length ; i++) {
            String[] d=days[i].split(" ");
            int x=Integer.parseInt(d[0]);
            int y=Integer.parseInt(d[1]);

            for (int j = x; j <=y ; j++) {
                freeFood.add(j);

            }

        }
        System.out.println(freeFood.size());

        }



    }

