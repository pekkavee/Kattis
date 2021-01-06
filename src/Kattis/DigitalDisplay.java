package Done_not_in_git;


import java.util.ArrayList;
import java.util.Scanner;

public class DigitalDisplay {
    public static void main(String[] args) {


        String []first  ={"+---+", "    +", "+---+", "+---+", "+   +","+---+","+---+","+---+","+---+","+---+"};
        String []second ={"|   |", "    |", "    |", "    |", "|   |","|    ","|    ","    |","|   |","|   |"};
        String []third  ={"|   |", "    |", "    |", "    |", "|   |","|    ","|    ","    |","|   |","|   |"};
        String []fourth ={"+   +", "    +", "+---+", "+---+", "+---+","+---+","+---+","    +","+---+","+---+"};
        String []fifth  ={"|   |", "    |", "|    ", "    |", "    |","    |","|   |","    |","|   |","    |"};
        String []sixth  ={"|   |", "    |", "|    ", "    |", "    |","    |","|   |","    |","|   |","    |"};
        String []seventh={"+---+", "    +", "+---+", "+---+", "    +","+---+","+---+","    +","+---+","+---+"};

        String a ="     ";
        String b ="  o  ";
        String c = "  ";


        Scanner sc = new Scanner(System.in);


        ArrayList<String>times=new ArrayList<>();

        while (true) {
            String y=sc.nextLine();
            if(y.equals("end")){
                break;
            }
            times.add(y);
        }
        sc.close();

        for (int i = 0; i <times.size() ; i++) {


            String clock=times.get(i);
            int g = Integer.parseInt(String.valueOf(clock.charAt(0)));
            int h = Integer.parseInt(String.valueOf(clock.charAt(1)));
            int j = Integer.parseInt(String.valueOf(clock.charAt(3)));
            int k = Integer.parseInt(String.valueOf(clock.charAt(4)));


            System.out.println(first[g] + c + first[h] + a + first[j] + c + first[k]);

            System.out.println(second[g] + c + second[h] + a + second[j] + c + second[k]);
            System.out.println(third[g] + c + third[h] + b + third[j] + c + third[k]);
            System.out.println(fourth[g] + c + fourth[h] + a + fourth[j] + c + fourth[k]);
            System.out.println(fifth[g] + c + fifth[h] + b + fifth[j] + c + fifth[k]);
            System.out.println(sixth[g] + c + sixth[h] + a + sixth[j] + c + sixth[k]);
            System.out.println(seventh[g] + c + seventh[h] + a + seventh[j] + c + seventh[k]);
            System.out.println();
            System.out.println();

        }
        System.out.println("end");
    }
}
