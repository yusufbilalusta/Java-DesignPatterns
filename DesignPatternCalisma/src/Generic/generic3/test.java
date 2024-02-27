package Generic.generic3;

import java.util.Scanner;

//YGS LYS BİRİNCİ BULMA
public class test {
    public static void main(String[] args) {
        System.out.println("YGS LYS BİRİNCİ BULMA");
        Scanner scanner =new Scanner(System.in);
        String islemler = "İşlemler...\n" +
                "1.Eşit Ağırlık Öğrencileri Birincisi" +
                "2.Sayısal Öğrencileri birincisi" +
                "Çıkış: q";
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("************************");

        while (true){
            System.out.println("İşlemi Giriniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor.....");
                break;
            }
            else if (islem.equals("1")) {
                
            } else if (islem.equals("2")) {

            }
            else System.out.println("Lütfen Geçerli Bir işlem Giriniz....");


        }

    }
    public static <E extends Aday> E birinci(E o1, E o2, E o3){
        if (o1.puanhesapla()> o2.puanhesapla() && o1.puanhesapla()>o3.puanhesapla()) {
            return o1;
        } else if (o2.puanhesapla()> o1.puanhesapla() && o2.puanhesapla()>o3.puanhesapla()) {
            return o2;
        }
        else return o3;
    }
}
