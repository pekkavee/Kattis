package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class EngineeringEnglis {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ArrayList<String> san = new ArrayList<>();


        String line;

        while ((line = br.readLine()) != null) {

            if (line.isEmpty()) {
                break;

            } else {
                String[] sanat = line.split(" ");
                san.addAll(Arrays.asList(sanat));
                san.add("\n");
            }


        }


        for (int i = 0; i < san.size(); i++) {
            String d = san.get(i).toLowerCase();
            if (san.get(i).equals(".") || san.get(i).equals("\n")) {

            } else {
                for (int j = i + 1; j < san.size(); j++) {
                    if (san.get(j).toLowerCase().equals(d)) {
                        san.set(j, ".");
                    }

                }
            }

        }
        for (String sana : san
                ) {
            if (sana.equals("\n")) {
                System.out.print(sana);
            } else {
                System.out.print(sana + " ");

            }
        }
    }

}