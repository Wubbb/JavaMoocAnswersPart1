
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 

        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);

        cardPekka.payGourmet();
        System.out.println("Pekka: " + cardPekka);

        cardBrian.payEconomical();
        System.out.println("Brian: " + cardBrian);

        cardPekka.loadMoney(20.0);
        System.out.println("Pekka: " + cardPekka);

        cardBrian.payGourmet();
        System.out.println("Brian:" + cardBrian);

        cardPekka.payEconomical();
        cardPekka.payEconomical();
        System.out.println("Pekka: " + cardPekka);

        cardBrian.loadMoney(50.00);
        System.out.println("Brian: " + cardBrian);

    }
}
