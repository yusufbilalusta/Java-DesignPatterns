package soru14;

public class Calculator extends Pow implements Sqrt {
    public int topla(int n1, int n2){
        return n1 + n2;
    }

    public int cikar(int n1, int n2){
        return n1 - n2;
    }

    @Override
    public int usHesapla(int sayi1, int sayi2) {

        return (int) Math.pow(sayi1,sayi2);
    }

    @Override
    public double karekokHesapla(int sayi1) {

        return Math.sqrt(sayi1);
    }
}
