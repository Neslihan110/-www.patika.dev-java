import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password, UserName, newPassword, oldPassword = "java123";
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı adınız :");
        UserName = input.nextLine();

        System.out.println("Şifreniz : ");
        password = input.nextLine();

        if (UserName.equals("patika") && password.equals("java123")) {
            ;
            System.out.println("giriş Yaptınız :");
        } else {
            System.out.println("Bilgileriniz yanlış :");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ? :");
            System.out.println("1-evet\n2-hayır :");
            System.out.println("seçiminiz ? :");
            int select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 1:
                    System.out.println("Yeni şireniz eski şifrenizden farklı olmalı!");
                    System.out.println("Yeni şirenizi Giriniz : ");
                    newPassword = input.nextLine();
                        System.out.println("Şireniz değiştirildi");
                        System.out.println("Şireniz varsayılan olarak bırakıldı.");
                        break;
                case  2:
                    System.out.println("Üzgünüm.Yardımcı olamadım");
                    break;
                default:
                    System.out.println("Teşekkür ederim");


                    }

            }

        }

    }
