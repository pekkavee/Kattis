package Done;

import java.util.Scanner;

public class Terrace {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String f =sc.nextLine();

        String[]g=f.split(" ");
        int max =Integer.parseInt(g[0]);
        int cases=Integer.parseInt(g[1]);
        int notAllowed=0;
        int q=0;

        for (int i = 0; i <cases ; i++) {
            String x =sc.nextLine();
            String []h=x.split(" ");
            String command=h[0];
            int v=Integer.parseInt(h[1]);

            if(command.equals("enter")) {
                if(max-v-q>=0){
                    q+=v;
                } else{
                    notAllowed++;
                }
            } else if(command.equals("leave")){
                q=q-v;
            }



        }
        System.out.println(notAllowed);

    }
}
