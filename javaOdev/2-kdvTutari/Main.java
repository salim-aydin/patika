/* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Para miktarını giriniz: ");
        double para = inp.nextDouble();

        double kdv = para > 1000 ? 0.08 : 0.18;
        double kdvTutari = para * kdv;
        double kdvliFiyat = para + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);

    }
}
