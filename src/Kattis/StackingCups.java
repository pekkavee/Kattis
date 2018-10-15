package Done;

import java.util.*;

public class StackingCups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        ArrayList<String>z=new ArrayList<>();
        HashMap<String,Integer>p=new HashMap<>();

        for (int i = 0; i <a ; i++) {
            String x=sc.nextLine();
            String[]xy=x.split("\\s+");
            String color=null;
            xy=x.split("\\s+");
            int u;
            try {
                u = Integer.parseInt(xy[0]);
                u=u/2;
                color=xy[1];

            } catch (NumberFormatException e) {
                u= Integer.parseInt(xy[1]);
                color=xy[0];


            }
            p.put(color,u);
        }

        List<Map.Entry<String, Integer>> order = new LinkedList<>(p.entrySet());

        Collections.sort(order, Comparator.comparing(o -> (o.getValue())));

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : order) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
    }
