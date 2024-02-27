package Factory;
//Burada Generic Kullanarak Oluşturmayı Denedim
//Her obje döndürdüğümüzde E ile casting yapmaya ihtiyaç duyduk
//Lütfen li kısmı sout ile ekrana bastırmayı denedim ancak
//Bunu kabul etmedi onun yerine throw yaptırdı.
public class TelefonFabrikasıDeneme {
 /*   public static <E extends Telefon> E getTelefon(String model, String batarya, int en, int boy) {
        E telefon;
        if ("S8".equalsIgnoreCase(model)){
            telefon = E instanceof  ? ((S8) (telefon = E)) : null;
        } else if ("Note8".equalsIgnoreCase(model)) {
            telefon = new Note8(model,batarya,en,boy);
        }
        else {
            throw new RuntimeException("Lütfen S8 veya Note8 modellerinden birini giriniz.");
        }
        return telefon;
    }*/
}
