import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int total = 0;
        Scanner inp = new Scanner(System.in);


        do {
            System.out.println("Sayi giriniz :");
            number = inp.nextInt();
            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("Toplam:" + total);
    }
}

