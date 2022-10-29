import java.util.Scanner;

public class count_pos_neg_zer {
 public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    int userinput;
    int countpos = 0, countneg = 0, countzer = 0;
    char yes = 'Y';
    
      for(int i = 0; 'Y' == yes; i++) {
          System.out.print("Enter number: ");
            userinput = scan.nextInt();
          System.out.println("Do you want to repeat? [Y], [N}");
          System.out.print("Answer: ");
            yes = scan.next().charAt(0);
            
            if (userinput == 0) {
                userinput = countzer;
                countzer++;
            }   
            if (userinput > 0) {
                userinput = countpos;
                countpos++;
            }    
            if (userinput < 0) {
                userinput = countneg;
                countneg++;
            }    
        
 
       
      }
       System.out.println("Positive: " + countpos);
       System.out.println("Negative: " + countneg);
       System.out.println("Zero: " + countzer);
      
 }
}