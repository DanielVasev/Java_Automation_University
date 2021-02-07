package chapter3;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
All sales people get a payment of $1000 a week.
Salesperson who exceed 10 sales get an additional bonus of $250.
 */
public class SalaryCalculator {

    public static void main(String[]Arhs){

        Scanner scan = new Scanner(System.in);

        int n = 0;
        while (n < 200){

            double salary = 1000;
        //Ask how many sales makes a this weekly!
        System.out.println("How many sales did you exceed this week");
        int sales = scan.nextInt();

        if (sales > 10){
            salary += 250;
            System.out.println("Your weely salary is: " + "$" + salary);
        }
        else{
            System.out.println("Your weely salary is: " + "$" + salary);
        }

            n++;
        }



    }

}
