import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1500, toplam = 0, q = 3;

        String username, password;
        int perlog = 3, balance = 1500, selection, price;


        while (perlog > 0) {
            System.out.println("Kullanıcı adınızı giriniz :");
            username = input.nextLine();
            System.out.println("Parolanızı giriniz :");
            password = input.nextLine();

            if (username.equals("yeter") && password.equals("1234")) {
                System.out.println("Merhaba A.Ç. bankasına hoş geldiniz! :");

                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-para yatırma/2-Para çekme/3-bakiye sorgulama");
                    selection = input.nextInt();

                    switch (selection) {
                        case 1:
                            System.out.println("Yatırılacak tutar :");
                            price = input.nextInt();
                            balance += price;
                            System.out.println("teşekkür ederiz.İşlemlerinize devam etmek ister misiniz ?");
                            break;

                        case 2:
                            System.out.println("Çekilecek tutar");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("bakiye yetersiz!");
                            } else {
                                balance -= price;
                                System.out.println("İşleminiz gerçekleşti.Teşekkür ederiz." +
                                        "Tekrar görüşmek üzere hoşçakalın." +
                                        "Sağlıklı günler dilerim.");
                            }
                            break;
                        case 3:
                            System.out.println("bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Gecersiz işlem seçtiniz.Lütfen tekrar deniyiniz.");
                            break;
                        default:
                            System.out.println("gecersiz işlem seçtiniz!");
                            break;
                    }
                } while (selection != 4);
                break;
            } else {
                perlog--;
                System.out.println("hatalı bir giriş yaptınız!Tekrar deneyiniz.");
                if (perlog == 0) {
                    System.out.println("hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
                } else System.out.println("kalan hakkınız:" + perlog);
            }
        }
    }
}




