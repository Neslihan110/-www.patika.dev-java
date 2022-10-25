import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, k;
        int total = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("üssü alınacak sayi : ");
        n = input.nextInt();

        System.out.println("üs olacak sayi : ");
        k= input.nextInt();

        for (int i =1 ; i<=k;i++) {
            total *= n;
        }
        System.out.println(n+" üssü "+k+" = "+total);
    }
}