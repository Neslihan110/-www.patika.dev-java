import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy, m;
        int kilo, kg;

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen boyunuzu metre cinsinden giriniz  : ");
        boy =input.nextDouble();

        System.out.println("lütfen kilonuzu  giriniz  : ");
        kilo=input.nextInt();

        double indeks= kilo /( boy * boy);
        System.out.println("vücut kitle indeksiniz : " + indeks);



    }
}