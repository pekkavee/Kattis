package Done_not_in_git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RollCall {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        ArrayList<String>names=new ArrayList<>();

        while (scan.hasNextLine()){
            String line = scan.nextLine();
            names.add(line);
            if (line.isEmpty()){
                break;
            }
        }

        for (int i = 0; i <names.size();  i++) {
            System.out.println(names.get(i));

        }
        Collections.sort(names);

        for (String name:names
             ) {
            System.out.println(name);

        }



        }
    }

