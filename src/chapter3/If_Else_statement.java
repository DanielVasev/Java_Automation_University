package chapter3;

import java.util.Scanner;

public class If_Else_statement {

    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);
        double salary = 1000;
        double bonus = 250;
        System.out.println("How many sales you`ve cover today?");
        int sales = scan.nextInt();

        if (sales <= 10){

            System.out.println("For less then 10 or 10 sales you`ve a basic salary!:" + "$" + salary);
        }
        else{
            System.out.println("You have reach more then the min sales! Your salary is normal salary plus bonus from $250: "
            + "$" + (salary + bonus));
        }




    }
}
