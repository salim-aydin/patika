/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        int matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        int fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
        int turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        int kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        int muzik = input.nextInt();

        int toplam = (matematik + fizik + turkce + kimya + muzik);
        double ortalama = toplam / 5;

        if (ortalama >= 55) {
            System.out.println("Sınıfı geçtiniz. Ortalamanız : " + ortalama);
        } else {
            System.out.println("Sınıfta kaldınız. Ortalamanız : " + ortalama);
        }

        
       

    }
}
