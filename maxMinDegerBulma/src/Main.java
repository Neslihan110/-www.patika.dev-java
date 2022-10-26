import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter, number, min = 1, max = 1;

        System.out.print("Kaç tane sayi gireceksiniz :");
        counter = input.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ".sayiyi giriniz :");
            number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
