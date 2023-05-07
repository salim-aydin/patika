import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinden)(ör:1,70) giriniz: ");
        double boy = inp.nextDouble();

        System.out.println("Lütfen Kilonuzu giriniz: ");
        double kilo = inp.nextDouble();

        double indeks = (kilo / (boy * boy));

        System.out.println("Vücut kitle indeksiniz: " + indeks);

    }
}
