package threadRace;

import java.util.ArrayList;
import java.util.List;

public class HelperClass extends Thread {

    private static List<Integer> evenNumbers = new ArrayList<>();
    private static List<Integer> oddNumbers = new ArrayList<>();
    List<Integer> subArray;
    static int number;

    public HelperClass(List<Integer> subArray) {
        this.subArray = subArray;
    }

    @Override
    public void run() {
        finder(this.subArray);
        print(Thread.currentThread().getName());
    }

    private synchronized void finder(List<Integer> subArray) {
        for (int i = 0; i < 25; i++) {
            number = subArray.get(i);
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
    }

    private void print(String threadName) {
        System.out.println(threadName + ":  " + evenNumbers);
        System.out.println(threadName + ":  " + oddNumbers);
    }
}