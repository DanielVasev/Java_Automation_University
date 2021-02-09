package chapter3;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[]Args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How old you are");
        int age = scan.nextInt();
        String message;

        switch (age){
            case 1: message = "Case 1 message";break;
            case 2: message = "Case 2 message!";break;
            case 10: message= "Case 10 message!"; break;
            default:message = "No such a case";break;

        }
        System.out.println(message);
    }
}
