import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar = 1.8, kdvliTutar = 11.8, KDVsizTutar = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.println("ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvTutar = tutar + kdvTutar;

        System.out.println("KDV'li Tutar :" + kdvTutar);
        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);

         boolean kosul1 = tutar>1000;
         double kosul2 =tutar * 0.8;
         System.out.println("1000 tL üstü kdvTutar :"+ kosul2);



    }
}

