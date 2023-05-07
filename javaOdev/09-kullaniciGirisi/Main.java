/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        String username, password;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        username = input.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {  
            System.out.println("Giriş Yaptınız!");                       
        } else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.println("Şifrenizi Sıfırlamak İster Misiniz? (E/H)");
            String cevap = input.nextLine();

            if (cevap.equals("E")) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Şifre Oluşturulamadı, Lütfen Başka Şifre Giriniz!");
                } else {
                    System.out.println("Şifre Oluşturuldu!");
                }
            } else {
                System.out.println("Şifre Oluşturma İşlemi İptal Edildi!");
            }
        }
    
       

    }
}
