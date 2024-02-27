package Vize_Soru6;

import java.util.ArrayList;
import java.util.Objects;


public class Yarisma {

    private ArrayList<Integer> puanList = new ArrayList<>();



    public <E> void puanEkle(E puan) throws ValueError,TypeError {


        if (!(puan instanceof Integer)) {
            throw new TypeError("TypeError: " + puan + " puan olarak eklenemez.");
        }
        int intPuan = (Integer)puan;
        if(intPuan>10 || intPuan<0){
            throw new ValueError(puan + "not olarak eklenemez");
        }
        puanList.add(intPuan);

    }

    public ArrayList<Integer> getPuanList() {
        return puanList;
    }

    public void setPuanList(ArrayList<Integer> puanList) {
        this.puanList = puanList;
    }
}
