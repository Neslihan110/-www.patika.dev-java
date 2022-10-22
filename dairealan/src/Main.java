import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin yarı çapını giriniz : ");
        r = inp.nextInt();

        int a;
        Scanner inputa = new Scanner(System.in);
        System.out.println("Merkez açısının ölcüsü a  giriniz : ");
        a = (int) inputa.nextDouble();

        double daireDilimininAlan= (pi * (r*r) * a) / 360;
        System.out.println("Dairenin diliminin alanı :" + daireDilimininAlan );


    }
}