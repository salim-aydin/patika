import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int inputNumber = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < inputNumber; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            average = Math.round(average * 100.0) / 100.0;
            System.out.print("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: ");
            System.out.println(average);
        } else {
            System.out.println("Girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen hiçbir sayı bulunmamaktadır.");
        }
    }
}
