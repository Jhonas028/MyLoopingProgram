import java.util.Scanner;

public class dowhile01 {
    public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    
   int num1, num2;
   char Y;
    
    
        
        
        do {
            System.out.print("First number: ");
                num1 = scan.nextInt();
            System.out.print("Second number: ");
                num2 = scan.nextInt();
            System.out.println("Result: " + (num1 + num2));
            System.out.println("Do you want to repeat? Please Type [Y],[N]");
            System.out.print("Answer: ");
                Y = scan.next().charAt(0);
            }
                while (Y == 'Y');
        
    }
}