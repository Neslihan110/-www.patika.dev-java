import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut;
        double Elma;
        double Domates;
        double Patlıcan;
        double Muz ;
        double kilo;
        double toplam= 0;

        System.out.println("Armut kaç kilo :");
        kilo = input.nextDouble();
        armut =kilo*2.14;

        System.out.println("Elma kaç kilo :");
        kilo = input.nextDouble();
        Elma =kilo*3.67;

        System.out.println("Domates kaç kilo :");
        kilo = input.nextDouble();
        Domates =kilo*1.11;

        System.out.println("Patlıcan kaç kilo :");
        kilo = input.nextDouble();
        Patlıcan =kilo*5.00;

        System.out.println("Muz kaç kilo :" );
        kilo = input.nextDouble();
        Muz =kilo*0.95;

        toplam = armut+ Patlıcan + Domates + Muz + Elma;
        System.out.println("toplam tutar :" + toplam);

    }
}