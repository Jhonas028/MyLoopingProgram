import java.util.Scanner;
public class squared {
    public static void main(String args[]) {
      
      Scanner scan = new Scanner(System.in);
      
      int x = 10;
      int y;
      
      for(int i = 1; i <= x; i++) {
            y = i * i;
          System.out.println(i + " = " + y);
      }
      
      
      
    }
}