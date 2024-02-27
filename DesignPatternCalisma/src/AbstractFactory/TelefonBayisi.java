package AbstractFactory;

public class TelefonBayisi {
    public static void main(String[] args) {
        S8Fabrikası s8Fabrikası = new S8Fabrikası();
        Telefon s8 = s8Fabrikası.getTelefon("s8","2600mah",4,7);

        Note8Fabrikası note8Fabrikası =new Note8Fabrikası();
        Telefon note8 = note8Fabrikası.getTelefon("note8","3000mah",5,8);

        System.out.println(note8);
    }
}
