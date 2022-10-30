import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main (String[]args){
        
        Scanner scan = new Scanner(System.in);
        
        int userinput;
        
        System.out.println("Lets play a Guessing game.");
        System.out.println("==========================================");
        System.out.println("Guess the number from 0 to 10");
        System.out.println("GAME !!!");
        System.out.println("==========================================");
       
            
            
        Random random = new Random();  
        int x = random.nextInt(10); 
        
        for(int i=0; i >= 0; i++) {
            System.out.print("What is your Guess number? ");
                userinput = scan.nextInt();
            if (userinput > x) {
                System.out.println("Too high, try again.");
            } 
            if (userinput < x) {
                System.out.println("Too low, try again.");
            }
            if (userinput == x) {
                System.out.println("You guess it Right! CONGRATULATION !!!");
                break;
            }
        }
        