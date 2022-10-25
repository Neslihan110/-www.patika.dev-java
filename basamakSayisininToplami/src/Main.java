import java.util.Scanner;

    public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");

        int number = input.nextInt();
        int adet = 0,toplam =0;
        while (number !=0)
        {
            toplam += (number%10);
            number /=10;
            ++adet;
        }
        System.out.println("basamak adeti :" + adet);
        System.out.println("basamak sayısı :"+ toplam);
    }

}