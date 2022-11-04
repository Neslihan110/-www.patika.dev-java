import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

            int size, temp=0;
            Scanner tara = new Scanner(System.in);
            System.out.print("Sıralamak istediğiniz array boyutunu giriniz :");
            size = tara.nextInt();

            if(size>0)
            {
                int[] arr = new int[size];
                for(int i=0;i<size;i++)
                {
                    System.out.printf("%d. elemani giriniz:",i+1);
                    arr[i]= tara.nextInt();
                }

                System.out.println("Sıralanmamış dizi: "+Arrays.toString(arr));

                for(int i=0;i<size;i++)
                {
                    for(int j=i+1;j<size;j++)
                    {
                        if(arr[i] > arr[j])
                        {
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }

                System.out.println("Sıralanmış dizi: "+Arrays.toString(arr));
            }

            else
            {
                System.out.print("Hatalı giriş.");
                System.exit(0);
            }

        }
    }

