package Vize_Soru5;

public class Drone extends Otonom implements Vasıta{

    private int hız;

    public Drone(int hız) {
        this.hız = hız;
    }


    @Override
    public void Hızlan() {
        if (hız!=90){
            System.out.println("Drone hızlanıyor...");
            System.out.println("Hızınız: "+ hız);
            hız+=5;
        }

    }

    @Override
    public void Fren() {
        if (hız!=0){
            System.out.println("Drone yavaşlıyor...");
            hız+=5;
        }
    }

    @Override
    public void OtonomHareket() {
        System.out.println("Drone Otonom Uçabiliyor.");
    }

    public int getHız() {
        return hız;
    }

    public void setHız(int hız) {
        this.hız = hız;
    }
}
