package Done_not_in_git;


import java.util.Arrays;
import java.util.Scanner;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        String[]numbers=sc.nextLine().split(" ");
        sc.close();
        int day=0;
        int min;
        int [] numbs = new int[numbers.length];
        int [] numbsord = new int[numbers.length];

        for (int i = 0; i <numbers.length ; i++) {
            numbs[i]= Integer.parseInt(numbers[i]);
            numbsord[i]= Integer.parseInt(numbers[i]);

        }


        Arrays.sort(numbsord);
        min=numbsord[0];

        for (int i = 0; i < numbs.length; i++) {
            if (min==numbs[i]){
                day=i;
                break;
            }
        }
        System.out.println(day);

    }



}

