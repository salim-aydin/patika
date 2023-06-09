import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int tripType = scanner.nextInt();

        if (distance > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double pricePerKm = 0.10;
            double totalPrice = distance * pricePerKm;

            if (age < 12) {
                totalPrice *= 0.5;
            } else if (age >= 12 && age <= 24) {
                totalPrice *= 0.9;
            } else if (age > 65) {
                totalPrice *= 0.7;
            }

            if (tripType == 2) {
                totalPrice *= 0.8;
                totalPrice *= 2;
            }

            System.out.printf("Toplam Tutar = %.2f TL%n", totalPrice);
        } else {
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
