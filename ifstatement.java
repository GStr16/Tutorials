package Tutorial;

import java.util.Scanner;

public class ifstatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text= sc.next();
        String text2="Hello";

        if (text.equals(text2))
            System.out.println("The text are the sames!");
        else
            System.out.println("The text are not the sames!");

        System.out.println("Enter your number:");
        int number = sc.nextInt();

        if(number < 10)
            System.out.println("Your namber is less then 10");
        else
            if(number > 10)
            System.out.println("Your number is high then 10");
            else
                if(number == 10)
                    System.out.println("Your number is equal with 10");
    }
}