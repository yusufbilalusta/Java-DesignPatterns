package Factory;

public interface Telefon {
    public String isim = "Bilal";
    default String merhaba(){
        System.out.println("Baevn");
        return null;
    }
    String getModel();
    String getBatarya();
    int getEn();
    int getBoy();




}
