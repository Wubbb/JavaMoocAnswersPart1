
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        
        int i =0;
        int result=0;
        while(i<=num ) {
            result += i;
            i++;
        }
        System.out.println(result);
        
        
    }
}
