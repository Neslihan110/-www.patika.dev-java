import java.util.Scanner;

public class Main {
    public static void main(String[] args){

            int yas, yolculukTipi, mesafe;
            double yasİndirimOranı;

            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen mesafeyi giriniz(KM) :");
            mesafe = input.nextInt();

            System.out.println("Lütfen yasınızı giriniz :");
            yas = input.nextInt();

            System.out.println("yolculuk tipini giriniz :");
            System.out.println("1=> tek Yön/n2 => Gidiş- Dönüs");
            yolculukTipi = input.nextInt();

            if ((mesafe > 0) && (yas > 0) && (yolculukTipi == 1 || yolculukTipi == 2)) {

                if (yas < 12) {
                    yasİndirimOranı = 0.50;

                } else if (yas < 12 && yas < 24) {
                    yasİndirimOranı = 0.10;
                } else {
                    yasİndirimOranı = 0;
                }

                double normalTutar = mesafe * 0.10;
                double yasİndirimi = normalTutar * yasİndirimOranı;
                double indirimliTutar = normalTutar - yasİndirimi;
                double toplamTutar;

                if (yolculukTipi == 2) {
                    double gidisDonusİndirimi = indirimliTutar * 0.20;
                    toplamTutar = (indirimliTutar - gidisDonusİndirimi) * 2;
                } else {
                    toplamTutar = indirimliTutar;
                }
                System.out.println("Toplam Tutar : " + toplamTutar + "TL");
            }
        }
    }








