package Factory;

public class TelefonBayi {
    public static void main(String[] args) {
        Telefon s8 = TelefonFabrikası.getTelefon("s8","3000mah",4,7);
        Telefon note8 = TelefonFabrikası.getTelefon("note8","5000mah",5,8);


        System.out.println(s8);
        System.out.println(note8);

    }
}
