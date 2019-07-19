
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second");
        int scnd = Integer.parseInt(reader.nextLine());        
        while(first <= scnd) {
            System.out.println(first);
            first++;
        }

    }
}
