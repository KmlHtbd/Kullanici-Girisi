import java.util.Scanner;
public class kullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, newPassword,select;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı:");
        userName = input.nextLine();
        System.out.print("Şifre:");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.print("Giriş Başarılı");
            }else {
            System.out.print("Hatalı Bilgi Girişi Yaptınız.");
            System.out.print("Şifrenizi Sıfırlamak İster misiniz? (Y/N): ");
            select = input.nextLine();
            if (select.equals("Y") || select.equals("y")) {
                System.out.print("Yeni Şifrenizi Giriniz:");
                newPassword = input.nextLine();
                if (!newPassword.equals("java123")) {
                    System.out.print("Yeni Şifreniz Başarılı Bir Şekilde Oluşturuldu.");
                } else {System.out.print("Yeni şifreniz eski şifreniz ile aynı olamaz! Lütfen başka bir şifre giriniz:");}
            }
        }
    }
}