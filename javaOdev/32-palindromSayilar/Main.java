import java.util.Scanner;

public class Main {


    //Palindrom sayı her iki taraftanda okunduğunda aynı sayıyı veren sayıdır.

    static boolean isPalindrom(int number){
        int temp = number,invertedNumber=0,lastNumber;
        while (temp !=0)
        {
            lastNumber= temp %10;
            invertedNumber = (invertedNumber*10) + lastNumber;
            temp/=10;

        }
        if (number == invertedNumber) {
            System.out.println(number + " is a palindrom number.");
            return true;
        }
        else {
            System.out.println(number + " is not a palindrom number");
            return false;
        }
    }

    public static void main (String[] Args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = read.nextInt();

        System.out.print(isPalindrom(number));

    }
}
