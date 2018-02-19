package Done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncodedMessage {


        public static void main(String[] args) throws IOException {

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


            int op = Integer.parseInt(br.readLine());
            for (int c = 0; c < op; c++) {



                StringBuilder sb =new StringBuilder(br.readLine());
                StringBuilder sb1 =new StringBuilder();



                int p = (int) Math.sqrt(sb.length());


                for (int w = 0; w < p; w++) {
                    int l = p - 1 - w;
                    for (int j = 0; j < p; j++) {

                        sb1.append(sb.charAt(l));
                        l += p;


                    }


                }
                System.out.println(sb1);
            }
        }
    }



