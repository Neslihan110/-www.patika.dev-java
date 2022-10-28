import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String menu =
                "1-Toplama \n" +
                "2-Cikartma\n" +
                "3-Carpma\n" +
                "4-Bolme\n" +
                "5-Uslu Sayi Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdortgen cevre ,alan Hesaplama\n";
        int select;
        do {



            System.out.println(menu);
            System.out.print("Bir islem seciniz :");
            select= inp.nextInt();
            switch (select){
                case 1:
                    System.out.println("Sonuc :"+toplama(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 2:
                    System.out.println("Sonuc :"+cikarma(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 3:
                    System.out.println("Sonuc :"+carpam(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 4:
                    System.out.println("Sonuc :"+bolme(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 5:
                    System.out.println("Sonuc :"+uslu(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 6:
                    System.out.println("Sonuc :"+faktor(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 7:
                    System.out.println("Sonuc :"+mod(1,1));
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                case 8:
                    dikdort(1,1) ;
                    System.out.println("İşleminiz gerçekleti.İşte sonuç :)");
                    break;
                default:
                    System.out.println("\nHatali islem! Lütfen Tekrar deneyin. \n");


            }
        }while (select!=0);
    }
    static int toplama(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a = inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        return a +b;
    }
    static int cikarma(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        return a-b;
    }
    static int carpam(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        return a*b;
    }
    static double bolme(double a,double b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        return a/b;
    }
    static int uslu(int a,int b){
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        int toplam =1;
        for (int i=1;i<=b;i++){
            toplam*=a;
        }
        return toplam;
    }
    static int faktor(int a,int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi  girin :");
        a = inp.nextInt();
        int toplam =1;
        for (int i=1;i<=a;i++){
            toplam*=i;
        }
        return toplam;
    }
    static int mod(int a,int b){
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci sayiyi  girin :");
        a= inp.nextInt();
        System.out.print("Ikinci sayiyi  girin :");
        b=inp.nextInt();
        int toplam=a%b;
        return toplam;
    }


    static int dikdort(int a, int b) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun kenar :");
        a= inp.nextInt();
        System.out.print("Kisa kenar :");
        b=inp.nextInt();
        int cevre=(2*a)+(2*b);
        int alan =a*b;
        System.out.println("Alan :"+alan+"\n"+"Cevre :"+cevre);
        return alan;

    }
}