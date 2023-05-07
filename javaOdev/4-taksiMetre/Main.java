import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        double km = inp.nextDouble();

        if ( km <= 20){
            System.out.println("Ücret: " + 20);
        }
        else{
            double ucret = 10 + ((km) * 1.5);
            System.out.println("Ücret: " + ucret);
        }
      
    }
}
