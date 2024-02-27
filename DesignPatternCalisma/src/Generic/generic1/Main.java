package Generic.generic1;

public class Main {
    public static void main(String[] args) {
        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","python","c++","php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};



        CharYazdir.yazdir(char_dizi);
        System.out.println();
        IntegerYazdir.yazdir(integer_dizi);
        System.out.println();
        StringYazdir.yazdir(string_dizi);
        System.out.println();
        OgrenciYazdir.yazdir(ogrenci_dizi);
        System.out.println("*************");
        GenericYazdirma<Integer> a = new GenericYazdirma<>();
        a.yazdir(integer_dizi);
        }
    }
