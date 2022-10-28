import java.util.Scanner;
public class Main {
    static boolean isPalindrom(int number) {

        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }
        if (number == reverseNumber) {
            System.out.println("polidrom sayıdır:");
            return true;

        } else {
            System.out.println("polidrom sayı değildir:");
            return false;

        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("BİR SAYI GİRİNİZ:");
        int n = inp.nextInt();
        System.out.println(isPalindrom(n));
    }
}


