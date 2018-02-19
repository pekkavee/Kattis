package Done;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Cd {

    public static void main(String[] args) throws IOException {


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true) {


            String f =br.readLine();

            String[] o =f.split(" ");
            int b = Integer.parseInt(o[0]);
            int c =Integer.parseInt(o[1]);
            int y =b+c;


            Set<Integer> a = new HashSet<>();

            if (y == 0) {

                break;

            }

            for (int i = 0; i < (y); i++) {


                int u = Integer.parseInt(br.readLine());


                a.add(u);



            }

            System.out.println((y)-a.size());

        }







    }

}



