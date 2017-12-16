package PVM;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Administrator on 14.12.2017.
 */
public class PVM {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String alkupvm;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime date = LocalDateTime.now();
            String tmpv =date.format(formatter);
            System.out.println("lasketaanko tästä päivästä");
            String painallus = sc.nextLine();
            if(painallus.equalsIgnoreCase("K")) {
                alkupvm=tmpv;
            } else {
                System.out.println("anna pvm ja kellon aika, mistä lasketaan (esim. 31/01/2014 22:10:59");
                alkupvm = sc.nextLine();
            }
            System.out.println("anna pvm ja kellon aika, mihin lasketaan (esim. 31/01/2014 22:10:59");
            String loppupvm = sc.nextLine();
            sc.close();





            laskeVali(alkupvm, loppupvm);




        }
        public static boolean isValidDate(String dateString) {
            Date date = null;
            try {
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                df.setLenient(false);
                date = df.parse(dateString);
                return true;
            } catch (ParseException e) {
                return false;
            }
        }



        public static void laskeVali (String pvm1, String pvm2) {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

            Date p1 = null;
            Date p2 = null;

            if (isValidDate(pvm1) && isValidDate(pvm2)) {

                try {
                    p1 = df.parse(pvm1);
                    p2 = df.parse(pvm2);
                    long erotus = p2.getTime() - p1.getTime();

                    long Seconds = erotus / 1000 % 60;
                    long Minutes = erotus / (60 * 1000) % 60;
                    long Hours = erotus / (60 * 60 * 1000) % 24;
                    long Days = erotus / (24 * 60 * 60 * 1000);
                    System.out.println("Päivämäärien välillä");
                    System.out.println("Päiviä: " + Days);
                    System.out.println("Tunteja: " + Hours);
                    System.out.println("Minuutteja: " + Minutes);
                    System.out.println("Sekunteja: " + Seconds);


                } catch (ParseException e) {
                    System.out.println("päivämäärissä vikaa..");
                }


            }
            else {
                System.out.println("päivämäärissä vikaa..");
            }
        }

    }

