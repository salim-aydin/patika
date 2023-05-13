public class Main {
    public static void main(String[] args) {
        int baslangic = 2;
        int bitis = 100;

        System.out.println("1 ile 100 arasindaki asal sayilar:");
        for (int sayi = baslangic; sayi <= bitis; sayi++) {
            boolean asal = true;

            // 1 ve kendisinden başka bir böleni olan sayılar asal değildir
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }

            if (asal) {
                System.out.print(sayi + " ");
            }
        }
    }
}
