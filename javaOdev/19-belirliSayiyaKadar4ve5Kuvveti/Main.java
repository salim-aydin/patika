import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int inputNumber = scanner.nextInt();

        System.out.println("Girilen sayıya kadar olan 4 ve 5'in kuvvetleri:");

        for (int i = 0; i <= inputNumber; i++) {
            double powerOfFour = Math.pow(4, i);
            double powerOfFive = Math.pow(5, i);

            if (powerOfFour <= inputNumber) {
                System.out.println("4^" + i + " = " + (int) powerOfFour);
            }
            if (powerOfFive <= inputNumber) {
                System.out.println("5^" + i + " = " + (int) powerOfFive);
            }
        }
    }
}
