import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        double r = inp.nextDouble();

        System.out.print("Merkez açısını giriniz: ");
        double a = inp.nextDouble();

        double pi = 3.14;

        double alan = (pi * (r * r) * a) / 360;

        System.out.println("Dairenin alanı: " + alan);

    }
}
