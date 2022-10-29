import java.util.Scanner;

public class Main {
    static void desen(int N, int tempNumber, int result) {
        if (tempNumber > 0) {
            System.out.print(result + " ");
            result -= 5;


            if (result <= 0) {
                tempNumber = result;
            }
            } else if (tempNumber <= 0) {
                System.out.print(result + " ");
                result += 5;

                if (result == N) {
                    System.out.print(result + " ");
                    return;
                }
            }
            desen(N, tempNumber, result);
        }
        public static void main (String[]args){
            int result, tempNumber;
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayi giriniz :");
            int N = input.nextInt();

            result = N;
            tempNumber = N;
            desen(N, result, tempNumber);
        }
    }

