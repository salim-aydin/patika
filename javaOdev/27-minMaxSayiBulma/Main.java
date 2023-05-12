import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();

        System.out.print("1. Sayıyı giriniz: ");
        int number = input.nextInt();

        int max = number;
        int min = number;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            number = input.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
