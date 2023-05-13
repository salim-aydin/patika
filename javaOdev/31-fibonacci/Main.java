import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;

        System.out.println("Fibonacci Serisi: ");
        System.out.print(sayi1 + " " + sayi2 + " ");

        for (int i = 2; i <= elemanSayisi; i++) {
            toplam = sayi1 + sayi2;
            System.out.print(toplam + " ");

            sayi1 = sayi2;
            sayi2 = toplam;
        }
    }
}
