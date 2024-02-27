package Generic.generic2;

public class test {
    public static void main(String[] args) {
/*        Character[] char_dizi = {'J','A','V','A'};
        Integer[] integer_dizi = {1,2,3,4,5,6};
        String[] string_dizi = {"Java","python","c++","php"};
        Ogrenci[] ogrenci_dizi = {new Ogrenci("Mustafa"),new Ogrenci("Mehmet"),new Ogrenci("Merve")};

        yazdir(ogrenci_dizi);

    }
    public static <E> void yazdir(E[] dizi){
        for (E c:
             dizi) {
            System.out.println(c);
        }*/


        Sayisal sayisal1 = new Sayisal(30,40,20,30);
        Sayisal sayisal2 = new Sayisal(25,45,2,35);


        EsitAgirlik e1 = new EsitAgirlik(1,40,20,30);
        EsitAgirlik e2 = new EsitAgirlik(2,4,2,35);


        System.out.println("Birinci ogrencinin puanı: "+birinci(sayisal1,e2,"Ahmet",18).puanhesapla());

    }
    //Burada string falan eklememin sebebi generic class a birden fazla
    //veri tipi parametre olarak ekleniyormu diye bakmak
    public static <E extends Aday> E birinci(E o1,E o2,String isim,int yas){
        if (o1.puanhesapla() > o2.puanhesapla()){
            System.out.println(isim);
            return o1;
        }
        else return o2;
    }
    //Obje dondurup o objenin bir metodunu kullandığımız için string dondurmesek bu kodda daha iyi
    //Ama bunu yazdırabildik
}
