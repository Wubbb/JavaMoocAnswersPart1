import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean loop = true;
        
        while(loop = true) {
            System.out.println("Type a word");
            String word = reader.nextLine();
            words.add(word);
            if(word.isEmpty()) {
                loop = false;
                break;
            }
        }
        
        for (String inputs : words ) {
            System.out.println(inputs);
        }
    }
}
