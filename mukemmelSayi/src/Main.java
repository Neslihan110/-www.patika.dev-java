import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        System.out.print("Mükemmel sayi sorgulaması yapacağınıza sayı :");
        n = input.nextInt();
        int total = 0;

        for (int i=1; i<n; i++) {
            if (n % i == 0) {
               total+=i;
            }
        }
        if (total==n) {
            System.out.println(n+"mükkemmel sayıdır");
        }else {
            System.out.println(n+"mükkemmel sayı değildir.");

        }
    }
}