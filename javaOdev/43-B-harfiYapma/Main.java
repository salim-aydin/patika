public class Main {
    public static void main(String[] args) {
        char[][] bLetter = new char[7][5];

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                // B harfinin dış çerçevesini oluşturma
                if (j == 0) {
                    bLetter[i][j] = '*';
                }
                else if (i == 0 || i == 3 || i == 6) {
                    if (j < 4) {
                        bLetter[i][j] = '*';
                    }
                    else {
                        bLetter[i][j] = ' ';
                    }
                }
                else if (j == 4 && i != 0 && i != 3 && i != 6) {
                    bLetter[i][j] = '*';
                }
                // Diğer boşlukları boş bırakma
                else {
                    bLetter[i][j] = ' ';
                }
            }
        }

        // Çıktıyı ekrana yazma
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(bLetter[i][j] + " ");
            }
            System.out.println();
        }
    }
}
