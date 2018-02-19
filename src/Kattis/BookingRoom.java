package Done;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //how many rooms
        int x = sc.nextInt();
        //booked rooms
        int y = sc.nextInt();

        ArrayList<Integer> rooms = new ArrayList<>();

        //booked rooms numbers
        for (int i = 0; i < y; i++) {
            int room = sc.nextInt();
            rooms.add(room);

        }
        if (rooms.size() < x) {
            while (true) {
                int randomroom = (int) Math.ceil(Math.random() * x);
                if (!rooms.contains(randomroom)) {
                    System.out.println(randomroom);
                    break;
                }
            }


        } else {
            System.out.println("too late");
        }
    }
}