package Denemeler;

public abstract class Soyut {
    public Soyut(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int a,b;
    public void call(int a,int b){
        this.a=a;
        this.b = b;
        System.out.println(a+b);
    }
}
