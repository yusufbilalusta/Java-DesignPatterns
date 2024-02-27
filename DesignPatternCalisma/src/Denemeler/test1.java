package Denemeler;




class eagle implements Arayuz{

    @Override
    public void abc() {

    }

    @Override
    public void def() {

    }
}
public class test1{
    private int a = 10;
    private static int b =6;

    public class Bird {
        int a = 1;
        public void yaz(){
            System.out.println(a);
            System.out.println(this.a);
            System.out.println(b);
            System.out.println("Kus yazıyor....");
        }
    }
}
class main{
    public static void main(String[] args) {
        new test1().new Bird();
    }
}
