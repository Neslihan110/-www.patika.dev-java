import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, combination, rnFactorial = 1,nFactorial = 1, rFactorial = 1;

        System.out.println("kümemiz kaç elemanlı ? : ");
        n = input.nextInt();
        System.out.println("Gruplar kaç elemanlı olsun ? : ");
        r = input.nextInt();

        for (int i =1; i <= n; i++) {
            nFactorial= nFactorial * i;
        }
        for (int j =1; j <= r; j++) {
            rFactorial = rFactorial * j;
        }

        for (int k =1; k <= n -r; k++) {
            rnFactorial = rnFactorial * k;
        }
        combination = (nFactorial / (rFactorial * rnFactorial));
        System.out.println(n+"in" +r+"'li kombinasyonu :"+combination);
    }
}