package exercises;

import java.util.Scanner;

public class Chapter2 {

    public static void main(String[]Args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Insert Season of the year");
        String season = scan.next();

        System.out.println("Enter a whole number");
        int number = scan.nextInt();

        System.out.println("Enter a adjective!");
        String adjective = scan.next();

        scan.close();

        System.out.println("On a " + adjective + " " + season +
                " day, i drink a minimum of " + number + " cups of coffee.");

    }

}
