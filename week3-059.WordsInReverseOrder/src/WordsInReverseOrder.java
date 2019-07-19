import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean checker = true;
        while(checker) {
            System.out.println("Type a word: ");
            String typedWord = reader.nextLine();
            words.add(typedWord);
            
             if(typedWord.isEmpty()) {
                checker = false;
                break;
             }   
        }
        Collections.reverse(words);
        for(String word : words) {
            System.out.println(word);
        }
    }
}
