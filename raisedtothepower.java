import java.util.Scanner;

public class raisedtothepower {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int num1, num2, result = 1;
        
        System.out.print("First number: ");
        num1 = scan.nextInt();
        
        System.out.print("Second number: ");
        num2 = scan.nextInt();
        
        for(int i=1; i<=num2; i++) {
            result = num1 * result;
        }
        
        System.out.println(num1 +" raised to "+ num2 +" = "+ result);
    }
}