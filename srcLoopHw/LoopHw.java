import java.util.Scanner;
import java.util.Random;

public class LoopHw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {       //zeki topçuya bayılırım
            System.out.println("--- Program Menüsü ---");
            System.out.println("1. Kullanıcıdan E-posta ve Şifre Sorma");
            System.out.println("2. Faktöriyel Hesaplama");
            System.out.println("3. Rastgele Çift ve Tek Sayı Sayma");
            System.out.println("0. Çıkış");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    checkEmailAndPassword(scanner);
                    break;
                case 2:
                    calculateFaktoryel(scanner);
                    break;
                case 3:
                    countCiftAndTekNumbers();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }

    private static void countCiftAndTekNumbers() { //buböyleoldu
    }

    //OxdaleChamberlain
    public static void checkEmailAndPassword(Scanner scanner) {
        String correctEmail = "user@example.com";
        String correctPassword = "12345";
        int deneme = 3;

        while (deneme > 0) {
            System.out.print("E-posta: ");
            String email = scanner.nextLine();
            System.out.print("Şifre: ");
            String password = scanner.nextLine();

            if (email.equals(correctEmail) && password.equals(correctPassword)) {
                System.out.println("Başarıyla giriş yaptınız!");
                return;
            } else {
                deneme--;
                if (deneme > 0) {
                    System.out.println("Hatalı giriş. Kalan hakkınız: " + deneme);
                } else {
                    System.out.println("Hakkınız bitti. Giriş başarısız.");
                }
            }
        }
    }

    public static void calculateFaktoryel(Scanner scanner) {
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        long faktoryel = 1;

        for (int i = 1; i <= number; i++) {
            faktoryel *= i;
        }

        System.out.println(number + " sayısının faktöriyeli: " + faktoryel);
    }

    public static void countTekAndCiftNumbers() {
        Random random = new Random();
    }
}