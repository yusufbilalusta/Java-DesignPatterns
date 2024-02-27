package Vize_Soru6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Yarisma yarisma = new Yarisma();

        try {
            System.out.print("Lutfen bir sayi girin: ");
            Scanner scanner = new Scanner(System.in);
            Object sayi = scanner.next();
            yarisma.puanEkle(sayi);


        } catch (TypeError e) {
            System.out.println(e.getMessage());
            ;
        } catch (ValueError e) {
            System.out.println(e.getMessage());
        }


    }
}
