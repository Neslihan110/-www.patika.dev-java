import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat, fizik, kimya, turkce, tarih, muzik;
       Scanner inp = new Scanner( System.in);
       System.out.println("Matemaik Notunuz : ");
       mat = inp.nextInt();
       System.out.println("fizik Notunuz : ");
       fizik = inp.nextInt();
       System.out.println("kimya Notunuz : ");
       kimya = inp.nextInt();
       System.out.println("turkce Notunuz : ");
       turkce = inp.nextInt();
       System.out.println("tarih Notunuz : ");
       tarih = inp.nextInt();
       System.out.println("Muzik Notunuz : ");
       muzik = inp.nextInt();
       int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
       double sonuc =  toplam / 6;
       System.out.println("ortalama : "+sonuc);

     boolean kosul1 =  toplam / 6 > 60;
     String str =kosul1 ? "Sınıfı Geçti":"Sınıfta kaldı";

     System.out.println(str);

        }
    }



