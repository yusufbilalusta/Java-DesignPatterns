package soru13;

public class Euclidean extends Distance {

    @Override
    public void mesafeHesapla(int x1, int x2, int y1, int y2) {
            double ilk = x2 - x1;
            double ikinci = y2 - y1;
        double sonuc = Math.sqrt(((ilk*ilk)+(ikinci*ikinci)));
        System.out.println("Oklid : "+ sonuc);
    }
}
