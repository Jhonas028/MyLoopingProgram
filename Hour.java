

public class Hour {
    public static void main(String[]args) {
    
    int num = 1;
    int num2 = 0, num3 = 0;
    String hour = String.format("%02d",num);
    
    
    
    for(int i = 0; i <= 9; i++) {
       String minute = String.format("%01d",num3);
       System.out.print(hour + ":");
       System.out.print(minute);
       System.out.println(i);
        if(i == 9) {
          for(int j = 10; j <= 15; j++){
            System.out.println(hour + ":" + j);
          }
        }
    }
  
  
       
    }
}