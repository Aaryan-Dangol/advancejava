package unit_one.mvcdesign.exampleOne;

public class CounterModel {
    private int count = 0;
    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void reset() {
        count = 0;
    }

    public void decrement() {

        if (count <= 0) {
            count = 0;
        } else {
            count--;
        }



    }

    public void incrementByTwo(){
        count+=2;
    }
}