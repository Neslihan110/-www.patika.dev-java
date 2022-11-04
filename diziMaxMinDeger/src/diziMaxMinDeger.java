import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class diziMaxMinDeger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -788, 2, 0};
        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int number = scan.nextInt();

        Arrays.sort(list);
        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}


