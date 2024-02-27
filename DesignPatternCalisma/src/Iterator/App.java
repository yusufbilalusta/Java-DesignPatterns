package Iterator;

import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {


//    List<Soru> soruList = kitap.getSoruList();
//    for (Soru soru : soruList) {
//        Long soruNo = soru.getSoruNo();
//        System.out.println("Soru NO: " + soruNo);
//    }

//    Soru[] sorular = fasikul.getSorular();
//    for (Soru soru : sorular) {
//        Long soruNo = soru.getSoruNo();
//        System.out.println("Soru NO: " + soruNo);
//    }


        /**
         * Yeni İşlem
         */
        Kitap kitap = new Kitap("Matematik");
        Fasikul fasikul = new Fasikul("Türkçe");

        Iterator fasikulIterator = fasikul.getSorularArrayIterator();
        Iterator soruListIterator = kitap.getSoruListIterator();
        yazdir(soruListIterator);
        yazdir(fasikulIterator);
    }

    private static void yazdir(Iterator iterator) {
        while (iterator.hasNext()){
            Soru soru = (Soru) iterator.next();
            Long soruNo = soru.getSoruNo();
            System.out.println("Soru No: "+ soruNo);
        }
    }


}
