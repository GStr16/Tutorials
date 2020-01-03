package Tutorial;

import java.util.Scanner;

public class switchStatement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        while(true) {

            System.out.println("Enter your command:");
            int x = sc.nextInt();

            switch (x) {
                case 1: {
                    System.out.println("Hello World");
                    break;
                }
                case 2 :
                    System.exit(0);
                    break;
                case 3: {
                    System.out.println("Enter your numbers!");
                    int b = sc.nextInt();
                    int a = sc.nextInt();
                    int sum = a+b;
                    System.out.println(sum);
                    break;
                }
                case 4 :{
                    System.out.println("Enter your numbers!");
                    int b = sc.nextInt();
                    int a = sc.nextInt();
                    int mul = a*b;
                    System.out.println(mul);
                    break;
                }
                case 5 :{
                    System.out.println("Enter your name!");
                    String name = sc.next();
                    System.out.println("Your name is "+ name);
                    break;
                }
            }
        }
    }
}
