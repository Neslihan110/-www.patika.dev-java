import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        /*int number = (int) (Math.random() * 100);
*/
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz : ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giris yaptınız.Kalan hakkınız : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler.Doğru tahmin :) Tahmin ettiğin sayi : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı giriniz ! ");
                if (selected > number) {
                    System.out.println(selected + "sayisi gizli sayidan buyuktur ");
                } else {
                    System.out.println(selected + "sayisi gizli sayidan kucuktur ");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hak : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz !");
            if (!isWrong) {
                System.out.print("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}