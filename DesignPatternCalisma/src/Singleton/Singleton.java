package Singleton;

public class Singleton {
    private static int sayi=0;
    private static Singleton singleton;
    private Singleton(){
        System.out.println("Ben oluştum");
    }
    public static Singleton getSingleton(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        sayi++;
        System.out.println(sayi);
        return singleton;
    }
}
