import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz :");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.println(" ");
            }

            for (int m = 1; m <= (2 * i) - 1; m++) {
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = n; k < (n + i); k++) {
                System.out.println(" ");
            }
            for (int m = 1; m <= ((n - i) * 2) - 1; m++) {
                System.out.println("*");
            }
            System.out.println(" ");

        }
    }
}