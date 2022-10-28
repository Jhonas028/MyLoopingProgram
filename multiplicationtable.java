import java.util.Scanner;

public class multiplicationtable {
    public static void main(String args[]) {
    
    Scanner scan = new Scanner(System.in);
    
    
    int ui;
    
        System.out.print("Input number: ");
            ui = scan.nextInt();
    
    
    for (int i = 1; i <= 10; i++) {
            
        int y = ui * i;
        
         System.out.println(ui + "*" + i + "=" + y);
            
    }
 
    }
}