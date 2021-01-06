package Done_not_in_git;

import java.util.Scanner;

public class BasketballOneOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scores=sc.nextLine();
        sc.close();
        String teamA="A";
        String teamB="B";


        int aPoints=0;
        int bPoints=0;


        for (int i = 0; i <scores.length() ; i++) {

            String team = scores.substring(i, i+1);
            int score = Integer.parseInt(scores.substring(i+1, i+2));
            if(team.equals(teamA)){
                aPoints=aPoints+score;
            } else {
                bPoints=bPoints+score;
            }
            i++;


        }

        if(aPoints>bPoints) {
            System.out.println(teamA);
        } else {
            System.out.println(teamB);
        }



    }
}
