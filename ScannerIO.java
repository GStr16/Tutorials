//Importing java.util.Scanner, with this library you can find the Scanner class, With Scanner helps you can input data from your keyboard
import java.util.Scanner;
public class ScannerIO {
    // main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //This is the Object when is created a references with sc names from System.in using Scanner

        System.out.print("Enter your name: "); // Output messages
        String name = sc.nextLine(); // Declare the String variable
        System.out.println("Your name is "+name); // Output the name variable

        System.out.print("Enter your age: "); // Output messages
        int age = sc.nextInt(); // Declare the Integer variable
        System.out.println("Your age is "+age);// Output the age variable

        System.out.print("Enter you height: ");// Output messages
        float height = sc.nextFloat(); // Declare the float variable
        System.out.println("Your height is "+height); // Output the height variable


    }
}
