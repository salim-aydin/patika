import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakToplami = 0;

        while (sayi != 0) {
            basamakToplami += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " + basamakToplami);
    }
}
