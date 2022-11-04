import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arr ={10,7,3,8,2,9,10,8,1,33,9,1};
        int []  storage  = new int [arr.length];

        int count, item,total = 0;
        int startIdx = 0;
        for (int i =0; i<arr.length; i++) {
            item = arr[i];
            count = 0;
            if (item%2 == 0) {
                count += 1;
                storage[startIdx++] = item;
            }
            total += count;
        }
        int[] newStorage = new int[total];
        for (int i = 0; i < total; i++) {
            newStorage[i] = storage[i];
        }
        for (int i = 0;  i < total; i++) {
            System.out.print(newStorage[i] + " ");
        }
    }
}