package chapter3;

import java.util.Scanner;

public class If_statement {
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        double salary;

        System.out.println("What is your salary?");
        salary = scan.nextDouble();

        if (salary <= 1000){
            System.out.println("You have a basic salary!:" + "$" + salary );
        }


    }

}
