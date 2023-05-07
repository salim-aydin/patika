import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz : ");

        int sicaklik = sc.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (sicaklik >= 10 && sicaklik <= 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (sicaklik >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        } else {
            System.out.println("Hatalı giriş yaptınız.");

        }
    }

}
