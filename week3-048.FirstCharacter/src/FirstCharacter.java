import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        System.out.println(firtCharacter(name));
    }
    
    public static char firtCharacter(String text) {
        return text.charAt(0);
    }
}
