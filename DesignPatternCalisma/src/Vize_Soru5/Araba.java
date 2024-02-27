package Vize_Soru5;

public class Araba implements Vasıta, Comparable<Araba>{
    private int hız;


    public Araba(int hız) {
        this.hız = hız;
    }


    @Override
    public void Hızlan() {
        if (hız!=180){
            System.out.println("Araba hızlanıyor...");
            System.out.println("Hızınız: "+ hız);
            hız+=20;
        }


    }

    @Override
    public void Fren() {
        if (hız!=0){
            System.out.println("Araba yavaşlıyor...");
            hız-=20;
        }
    }

    public int getHız() {
        return hız;
    }

    public void setHız(int hız) {
        this.hız = hız;
    }

    @Override
    public int compareTo(Araba o) {
        return 0;
    }
}
