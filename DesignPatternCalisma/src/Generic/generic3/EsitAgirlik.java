package Generic.generic3;

public class EsitAgirlik extends Aday {
    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik,String isim) {
        super(turkce, matematik, edebiyat, fizik,isim);
    }

    @Override
    public int puanhesapla() {
        return getMatematik()*5 + getTurkce()*5 + getFizik()*1 + getEdebiyat()*4;
    }
}
