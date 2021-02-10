package chapter4;

import java.util.Scanner;

/*
* While Loop:
* Each store employee makes $15 an hour. Write a program that allows the employee
* To enter the number of hours worked for the week. do not allow overtime.
 */
public class While_Loop {
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);

     //Initialize known variables
     int rate = 15;
     int max_hours = 40;

        System.out.println("How many hours did you work this week?");
        Double hours = scan.nextDouble();

        while (hours > max_hours) {
            System.out.println("Wrong Input! Enter value between 1-40. Try again!");
            hours = scan.nextDouble();

        }
        scan.close();

        double salary = hours * rate;
        System.out.println("Your weekly salary is: $" + String.format("%.2f",salary));
    }
}
