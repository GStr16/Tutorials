//import library from input my data from my keyboard
import java.util.Scanner;


public class switchStatement {

//    Create an Object with the Scanner Class
    static Scanner sc = new Scanner(System.in);
//    main function
    public static void main(String[] args) {
        System.out.println("Enter your command: ");
        int command = sc.nextInt();

        switch (command) {
            case 1:
                System.out.println("Hello World");
                break;
            case 2:
                System.exit(0); //close your program
        }
    }
}