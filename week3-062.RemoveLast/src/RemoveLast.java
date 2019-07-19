import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    public static void removeLast(ArrayList<String> list) {
        list.remove(list.size()-1);
    }

    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        for(String person : persons) {
        System.out.print(" " + person);
        }
        System.out.println("");
        // sort the persons
        Collections.sort(persons);
        System.out.println("New List");
        // and remove the last
        removeLast(persons);

        for(String person : persons) {
        System.out.print(" " + person);
        
        }
        System.out.println("");
    }
}
