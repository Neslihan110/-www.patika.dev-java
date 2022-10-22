import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        n2 = input.nextInt();

        System.out.println("1-Toplam\n2-Çıkarma\n3-Çarma\n4-Bölmen\n5");
        System.out.println("Seçiniz : ");
        select = input.nextInt();

        switch (select ) {
        case 1 :
            System.out.println("Toplam : " + (n1 + n2));
            break;
        case 2 :
            System.out.println("Çıkarma : " + (n1 - n2));
            break;
        case  3 :
             System.out.println("Çarpma : " + (n1 * n2));
             break;
        case 4 :
            System.out.println("Böme : " + (n1/n2));
        case  0:
            System.out.println("bir sayı 0'a bölünemez");
            break;
                default:
                    System.out.println("Yanlış seçim yaptınız.Tekrar deneyiniz.");


        }
        }


    }