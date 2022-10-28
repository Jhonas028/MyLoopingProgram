public class sumof1to20 {
    public static void main(String args[]) {
        int sum = 0;
        
        for(int i=0; i<=20; i++) {
            sum = i + sum;
        }
        
        System.out.print("The sum of 1 to 20 is " + sum);
    }
}
