package exercises;

import java.util.Scanner;

public class Operator_Dollar_Game {
    public static void main(String[]Args){
    Scanner scan = new Scanner(System.in);

        int pennies = 1;
        int two_pence = 2;
        int five_pence = 5;
        int ten_pence = 10;
        int twenty_pence = 20;
        int fifty_pence = 50;
        int sum_coins;
        int sum;


    //1. Ask user how much coins it has and what type:
    System.out.println("How much 1p do you have?");
     sum_coins = pennies * scan.nextInt();

    System.out.println("How much 2p do you have?");
    sum_coins += two_pence * scan.nextInt();

    System.out.println("How much 5p do you have?");
    sum_coins += five_pence * scan.nextInt();

    System.out.println("How much 10p do you have?");
    sum_coins += ten_pence * scan.nextInt();

    System.out.println("How much 20p do you have?");
    sum_coins += twenty_pence * scan.nextInt();

    System.out.println("How much 50p do you have?");
    sum_coins += fifty_pence * scan.nextInt();

    if (sum_coins == 100){

        System.out.println("You have exsactly £1");

    }else if (sum_coins < 100){
        sum = 100 - sum_coins;
        System.out.println("You have sum of: " + sum_coins + " you need another " + sum + " to make £1");
    }else {

        sum = sum_coins - 100;
        System.out.println("You have over " + sum + "p");
    }

    }

}

