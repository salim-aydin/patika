import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (asalMi(sayi)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }

    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }

        return asalMiRecursive(sayi, 2);
    }

    private static boolean asalMiRecursive(int sayi, int bolen) {
        if (bolen >= sayi) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalMiRecursive(sayi, bolen + 1);
    }
}
