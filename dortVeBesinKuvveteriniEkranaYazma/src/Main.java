import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("sınır sayınızı giriniz :");
        int sayi = sc.nextInt();

        System.out.println(sayi + "   sayısından küçük dörtün kuvvetleri :");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.println(i + "   ");
        }
        System.out.println(sayi + "  sayısından küçük beşin kuvvetleri :");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.println(i + "   ");
        }
    }
}
