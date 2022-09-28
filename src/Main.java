import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password,newPassword;
        int secim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici adi: ");
        userName = inp.nextLine();
        System.out.print("Sifre: ");
        password = inp.nextLine();

        if (userName.equals("nadir") && password.equals("123456")) {
            System.out.println("Basariyla giris yapildi.");
        } else if (!userName.equals("nadir")) {
            System.out.println("Kullanici adi hatali.");
        } else if (userName.equals("nadir") && !password.equals("123456")) {
            System.out.println("Yanlis sifre girdiniz.");
            System.out.print("Sifrenizi sifirlamak ister misiniz ? (evet icin:1, hayir icin:2) \nSeciminiz: ");
            secim = inp.nextInt();

            if (secim == 1) {
                System.out.print("Yeni sifreniz: ");
                newPassword = inp.next();
                if (password.equals(newPassword) || newPassword.equals("123456")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } 
                else if (!newPassword.equals(password) && !newPassword.equals("123456")) {
                    System.out.println("Sifre olusturuldu.");
                }
            else if (secim == 2) {
                    System.out.println("Sifre olusturulmadi.");
                }
            }
            else {
                System.out.println("Hatali secim yaptiniz.");
            }

        }
    }
}
