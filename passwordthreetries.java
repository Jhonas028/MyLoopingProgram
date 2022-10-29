import java.util.Scanner;
public class passwordthreetries {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int pass = 123;
        int x, y;
        int tries = 3;
        
        System.out.print("Password: ");
        x = scan.nextInt();
        
        for (int i = 1; i < tries; i++) {
            if (i == 3) {
                System.out.print("Sorry but you have been locked out.");
                break;
            }
            
            if (x == pass) {
                System.out.println("Correct, Welcome back");
                break;
            } else if(x != pass) {
                System.out.println("Incorrect, try again.");
                
                System.out.print("Password: ");
                y = scan.nextInt();
                
                if (y == pass){
                    System.out.print("Correct");
                    break;
                }
            }
        }
    }
}