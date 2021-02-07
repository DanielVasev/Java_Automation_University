package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String []Args){

        //1. Ask user for hours per week
        System.out.println("Enter the number of hours you been working...");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();

        //2. Get pay rate
        System.out.println("Enter employee`s pay rate...");
        double rate = scan.nextDouble();

        //3. Multiply rate and hours
        double GrossPay = rate * hours;

        //4. Print result (Employee salary per week)
        System.out.println("Employee weely salary is: " + GrossPay);






    }

}
