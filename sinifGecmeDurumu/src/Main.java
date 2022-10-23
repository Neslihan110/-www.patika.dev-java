import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz :");
        mat = input.nextInt();

        System.out.println("Turkce notunuz :");
        turkce = input.nextInt();

        System.out.println("Fizik notunuz :");
        fizik = input.nextInt();

        System.out.println("Kimya notunuz :");
        kimya = input.nextInt();

        System.out.println("muzik notunuz :");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 55) {
            System.out.println("sınıfta kaldınız,seneye görüşmek üzere!");

        } else if (avarage < 0 || avarage > 100) {
            System.out.println("lütfen ders notunu 0 ie 100 arasında giriniz.");
        } else {
            System.out.println("Tebrikler!Ortalama  ile sınıfı geçtiniz.");

            }
        }
    }







