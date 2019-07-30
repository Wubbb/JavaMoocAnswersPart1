
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account newAcc = new Account("wubbb",100.0);
        
        newAcc.deposit(20.0);
        System.out.println( newAcc.toString() );
    }

}
