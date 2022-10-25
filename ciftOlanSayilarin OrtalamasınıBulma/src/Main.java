import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       int i,  sayi, sum = 0, avg, n = 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Bir Sayi Giriniz :");
        sayi = inp.nextInt();

        for (i=0; i<= sayi; i+=12) {
            sum+=i;
            n++;
        }
        avg=sum/n;
        System.out.println("3'e ve 4'e tam bölünen sayıların ortalaması :"+ avg);
    }
}