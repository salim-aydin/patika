import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printPattern(n);
        scanner.close();
    }
    
    public static void printPattern(int n) {
        System.out.print(n + " ");

        // Base case, if n is less than or equal to 0, we start to add 5.
        if (n <= 0) {
            if (n < 0) {
                printPattern(n + 5);
                System.out.print(n + " ");
            }
            return;
        }

        // Recursive call for subtraction
        printPattern(n - 5);

        // Print the number after returning from the recursion.
        System.out.print(n + " ");
    }
}
