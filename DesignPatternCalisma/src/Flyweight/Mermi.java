package Flyweight;

public class Mermi {
    private EnumMermiBoyutu mermiBoyutu;

    public Mermi(EnumMermiBoyutu mermiBoyutu) {
        this.mermiBoyutu = mermiBoyutu;
        System.out.println(mermiBoyutu.getBoyut() + " mm mermi oluştu.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void atesle(){
        System.out.println("Tak");
    }
}
