import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz : ");
        int number = input.nextInt();


        int number1 =0, number2=1;
        System.out.println(number1 + " " + number2 + " ");
        int number3= number1 + number2;

        for (int i=0 ; i<=number; i++);
        {
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
            number3 = number1 + number2;
        }
    }
}