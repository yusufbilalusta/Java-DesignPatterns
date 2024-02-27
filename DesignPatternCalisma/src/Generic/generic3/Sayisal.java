package Generic.generic3;

public class Sayisal extends Aday {
    public Sayisal(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanhesapla() {
        return getMatematik()*5 + getTurkce()*5 + getFizik()*4 + getEdebiyat()*1;
    }
}
