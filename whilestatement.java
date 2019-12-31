package Tutorial;

import java.util.Scanner;
public class whilestatement {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int i=0,count=0;
        while(n!=0) {
            if(n%2==0) {
                i++;

            }
            n--;
            System.out.println("Iteration:"+count);
            count++;
        }
        System.out.println("Your count is "+i);
    }
}
