import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                int  year ;
                boolean  leapyear = false ;
                Scanner  input = new Scanner(System.in);
                System.out.println ( "Yıl giriniz:" );
                year = input.nextInt();

        if ( year % 4 == 0 ){
                    if ( year % 100 == 0 && year % 400 != 0 ){
                        leapyear = false ;
                    } else  {
                        leapyear = true ;
                    }
                } else  {
                    leapyear = false;
                }

                if ( leapyear == true ){
                    System . out . println ( year + "bir artık yıldır!" );
                } else  {
                    System. out . println ( year + "bir artık yıl değil!" );
                }

            }
        }





