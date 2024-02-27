package Adapter;

public class Test {
    public static void main(String[] args) {
        Priz priz = new Priz();
        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);


        SamungTelefon samungTelefon = new SamungTelefon();
        TelefonEEAAdapter telefonEEAAdapter = new TelefonEEAAdapter(samungTelefon);
        telefonEEAAdapter.prizeTakVeCalistir();
        priz.elektrikVer(telefonEEAAdapter);



    }
}
