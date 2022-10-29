import java.util.Scanner;

public class boxusing_hashtag {
    public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    
    int height, width, body = 1;
    
    System.out.print("Enter height: ");
        height = scan.nextInt();
    System.out.print("Enter width: ");
        width = scan.nextInt();
        
   for (int i = 1; i <= height; i++) {
       
      for (int j = 1; j <= width; j++)
      {     
          System.out.print("#");
          
      }
         System.out.println(" ");
   }
     
        
    }
}