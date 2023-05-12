import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok;
        int i = 1;

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        ekok = (n1 * n2) / ebob;
        System.out.println("EBOB(" + n1 + ", " + n2 + ") = " + ebob);
        System.out.println("EKOK(" + n1 + ", " + n2 + ") = " + ekok);
    }
}
