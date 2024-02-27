package Denemeler;

import java.util.ArrayList;

public class app extends Soyut {
    public app(int a, int b) {
        super(a, b);
    }

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        ArrayList<String> benim = new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1,"D");

        System.out.println(obj);



    }




}
