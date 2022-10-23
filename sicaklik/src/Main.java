import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int head;
                Scanner input  = new Scanner(System.in);
                System.out.println("Sıcaklık Giriniz :");
                head = input.nextInt();

                if (head < 5 &&  head <=15) {
                    System.out.println("Kayak yapabilirsiniz.");
                } else if (head > 5 && head <=25) {
                    if (head <= 15) {
                     System.out.println("Sinemaya gidebilirsiniz.");
                    }
                if (head <= 10) {
                      System.out.println("Pikniğe gidebilirsiniz.");

                if (head <= 45) {
                       System.out.println("Evden çıkmayın.");
                    }
                }else {
                    System.out.println("Yüzmeye gidebiliriniz");




                }
            }


        }


}