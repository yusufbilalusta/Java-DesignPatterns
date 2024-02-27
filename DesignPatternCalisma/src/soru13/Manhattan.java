package soru13;

public class Manhattan extends Distance{


    @Override
    public void mesafeHesapla(int x1, int x2, int y1, int y2) {
        double sonuc = Math.abs(x1 - x2) + Math.abs(y1 - y2);
        System.out.println("Manhattan: " + sonuc);
    }
}
