public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Dizideki elemanları uniqueElemanlar dizisinde tutuyoruz
        int[] uniqueElemanlar = new int[dizi.length];
        int[] frekanslar = new int[dizi.length];
        int uniqueIndex = 0;

        // Dizideki elemanları uniqueElemanlar dizisine ekleyerek frekanslarını hesaplıyoruz
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            boolean isUnique = true;

            // uniqueElemanlar dizisinde elemanın daha önce bulunup bulunmadığını kontrol ediyoruz
            for (int j = 0; j < uniqueIndex; j++) {
                if (eleman == uniqueElemanlar[j]) {
                    // Eleman uniqueElemanlar dizisinde bulunduğunda frekansını arttırıyoruz
                    frekanslar[j]++;
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                // Eleman uniqueElemanlar dizisinde bulunmadığında yeni bir girdi ekliyoruz
                uniqueElemanlar[uniqueIndex] = eleman;
                frekanslar[uniqueIndex] = 1;
                uniqueIndex++;
            }
        }

        // Frekansları yazdırma
        for (int i = 0; i < uniqueIndex; i++) {
            System.out.println(uniqueElemanlar[i] + " sayısı " + frekanslar[i] + " kere tekrar edildi.");
        }
    }
}
