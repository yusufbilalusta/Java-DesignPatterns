package Generic.generic2;

public class EsitAgirlik extends Aday{
    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik) {
        super(turkce, matematik, edebiyat, fizik);
    }

    @Override
    public int puanhesapla() {
        return getMatematik()*5 + getTurkce()*5 + getFizik()*1 + getEdebiyat()*4;
    }
}
