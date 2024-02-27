package Adapter;

public class SamungTelefon implements Telefon {
    private int calismaVoltaji;

    public SamungTelefon() {
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
        System.out.println("Samsung telefon çalışıyor....");
        return calismaVoltaji;
    }
}
