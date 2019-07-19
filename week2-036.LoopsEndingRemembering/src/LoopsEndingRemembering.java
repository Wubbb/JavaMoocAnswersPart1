import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
int num;
int sum=0;
int counter=0;
int odd=0;
int even=0;
       
        while(true) {
         num = Integer.parseInt(reader.nextLine());
             if(num == -1){
              break;    
             } else if(num % 2 == 0) {
                 even++;
             } else {
                 odd++;
             }
         sum += num;
         counter++;
        }
        System.out.println(sum);
        System.out.println(counter);
        
        double avg =(double) sum / counter;
        System.out.println(avg);
        System.out.println(even);
        System.out.println(odd);
    }
}
