import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

                int  a,  b;
                double c;
                Scanner girdi = new Scanner(System.in);
                System.out.println("1. kenarı Giriniz : ");
                a = girdi.nextInt();

                System.out.println("2. kenarı Giriniz :");
                b = girdi.nextInt();

                c = Math.sqrt(a*a) + (b*b);
                System.out.println("Hipotenüs : " + c);

                double çevre,alan;
                çevre = a+b+c;
                System.out.println("üçgenin çevresi:" + çevre );
                alan = Math.sqrt ((çevre/2)*(çevre/2-a)*(çevre/2-b)*(çevre/2-c));
                System.out.println("üçgenin alanı:" + alan);

      }
        }

