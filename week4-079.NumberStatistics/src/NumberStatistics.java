
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {

    }

    // initialize here the object variable amountOfNumbers
    public void addNumber(int number) {
        // code here
        this.sum += number;
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        double sum = 0.0;

        if (this.amountOfNumbers > 0) {
            sum = (double) this.sum / (double) this.amountOfNumbers;
            return sum;
        } else {
            return 0;
        }
    }

}
