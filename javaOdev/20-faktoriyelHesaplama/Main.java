import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total=1;

        System.out.println("Sayıyı giriniz :");
        number = input.nextInt();

        for(int i =1 ; i<=number ; i++){
            total=total*i;
        }
        System.out.println("Faktöriyel = " + total);
    }
}
