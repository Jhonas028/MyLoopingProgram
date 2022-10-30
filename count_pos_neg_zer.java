import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        int zero = 0;
        int positive = 0;
        int negative = 0;
        
        char action;
        
        for(int i = 0; i >= 0; i++) {
            
            System.out.print("\nInput number: ");
            num = scan.nextInt();
            
            if (num == 0) zero++;
            if (num > 0) positive++;
            if (num < 0) negative++;
            
            System.out.print("Continue (Y/N)? ");
            action = Character.toUpperCase(scan.next().charAt(0));
            
            if (action == 'N') {
                System.out.println("\n--- Output ---");
                System.out.println("Zeros: " + zero);
                System.out.println("Positive: " + positive);
                System.out.println("Negative: " + negative);
                break;
            }
        }
    }
}
