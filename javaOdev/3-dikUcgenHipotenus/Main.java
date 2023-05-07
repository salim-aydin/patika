/*Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz ");
        int kenar1 = inp.nextInt();

        System.out.print("İkinci kenarı giriniz ");
        int kenar2 = inp.nextInt();

        System.out.print("Üçüncü kenarı giriniz ");
        int kenar3 = inp.nextInt();

        int u = (kenar1 + kenar2 + kenar3) / 2;

        double alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));

        System.out.println("Üçgenin alanı: " + alan);

    }
}
