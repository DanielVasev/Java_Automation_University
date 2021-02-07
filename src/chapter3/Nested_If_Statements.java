package chapter3;
/*
        To Qualify for a loan, person should make at least $30.000
        and working for them current job at least for last 2 years
         */

import java.util.Scanner;

public class Nested_If_Statements {
    public static void main(String[]Args){

        Scanner scan = new Scanner(System.in);

        double salary;
        double years_ot_current_work;

        //1. Ask for current salary
        System.out.println("What is your current salary");
        salary = scan.nextDouble();

        //2. Ask for how long been on current position
        System.out.println("For how many years you are working on the current position");
        years_ot_current_work = scan.nextDouble();

        if (salary < 30000){
            System.out.println("Your salary is less then the required salary min. You are not qualify for the loan!");
        }else if (years_ot_current_work < 2){
            System.out.println("You have less then the min work time in the current position... You are not qualify for the loan!");
        }else{
            System.out.println("You can have the loan!");
        }


    }

}
