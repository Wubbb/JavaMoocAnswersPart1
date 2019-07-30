import java.util.Scanner;
import java.util.*;

public class Palindromi {

    public static String reverse(String text) {
        String revText = "";
        boolean pal = true;
        
           for(int i=text.length()-1;i >= 0;i--) {
            revText += text.charAt(i);     
           }
           System.out.println(revText);
           return revText;
    }
    
    
    public static boolean palindrome(String text) {
        // write code here
           
        String rev = reverse(text);
        
        if(text.equals(rev)) {
            return true;
        }else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
