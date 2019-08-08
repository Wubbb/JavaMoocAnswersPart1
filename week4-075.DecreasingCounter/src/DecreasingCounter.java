
public class DecreasingCounter {

    private int value;  // instance variable that remembers the value of the counter
    private int initalValue;
    
    
    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initalValue = value;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        if (this.value <= 0) {
            return;
        } else {
            this.value--;
        }

    }

   public void reset() {
       this.value = 0;
   }
   
   public void setInitial() {
       this.value = initalValue;
   }
}
