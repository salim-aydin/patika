import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Elmasın yarıçapını girin: ");
        int n = scanner.nextInt();

        // Üst kısım
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Satırı bitir
            System.out.println();
        }

        // Alt kısım
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Satırı bitir
            System.out.println();
        }
    }
}
