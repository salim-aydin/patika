/*Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı;

Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplam;

        System.out.print("Armut Kaç Kilo ? :");
        armutKg = inp.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        elmaKg = inp.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        domatesKg = inp.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        muzKg = inp.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanKg = inp.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);

        System.out.println("Toplam Tutar : " + toplam + " TL");

    }
}
