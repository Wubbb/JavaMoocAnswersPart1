
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Up to what number? ");
        int num = Integer.parseInt(reader.nextLine());
        // Write your code here
        for(int i=1;i<=num;i++) {
            System.out.println(i);
        };
    }
}
