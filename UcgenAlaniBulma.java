package degisken_kavrami;
import java.util.Scanner;

public class UcgenAlaniBulma {

    public static void main(String[] args) {
        System.out.println("3 tane üçgen kenar uzunluğu giriniz.");
        //Değişkenleri tanımlama
        int a,b,c;
        double yariCevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk kenar uzunluğunu giriniz: ");
        a = input.nextInt();
        System.out.print("İkinici kenar uzunluğunu giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        c = input.nextInt();

        //yarım çevreyi hesaplama

        yariCevre = (a+b+c)/2;

        //alan Hesaplama
        alan = (yariCevre*(yariCevre-a)*(yariCevre-b)*(yariCevre-c));
        System.out.println("Üçgenin alanı : "+ alan);
    }
}
