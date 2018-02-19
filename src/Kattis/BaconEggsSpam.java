package Done;

import java.util.*;

public class BaconEggsSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int s = Integer.parseInt(sc.nextLine());
            if(s==0){
                break;
            }

            SortedSet<String> ruoka = new TreeSet<>();
            ArrayList<String> nimet = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                String u = sc.nextLine();
                nimet.add(u);
                String[] fsd = u.split(" ");
                ruoka.addAll(Arrays.asList(fsd).subList(1, fsd.length));


            }
            Collections.sort(nimet);

            for (String temp : ruoka) {
                System.out.print(temp + " ");
                for (String aNimet : nimet) {
                    if (aNimet.contains(temp)) {
                        String[] n = aNimet.split(" ");
                        System.out.print(n[0] + " ");
                    }

                }
                System.out.println();

            }
            System.out.println();
        }
    }
}
