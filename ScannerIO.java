package Tutorial;

//import java.util.*;
import java.util.Scanner;

public class ScannerIO {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is "+ name);
        System.out.println("Enter your favorite color");
        String color = sc.next();
        System.out.println("Your color is "+color);

        System.out.println("Enter you age");
        int age = sc.nextInt();
        System.out.println("Your age is "+age);

        System.out.println("Enter your height:");
        float height = sc.nextFloat();
        System.out.println("Your height is "+height);
    }
}
