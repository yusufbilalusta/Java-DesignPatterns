package Recursive;

public class BinarySearch {
    public static void main(String[] args) {
        int[] dizi = {1,2,3,4,5,6,7,8,9};
        int boy = dizi.length;

        int ilk = 0;
        int son = boy-1;
        int aranan=3;
        int sonuc = binarySearch(dizi,ilk,son,aranan);
        System.out.println("Sonuc: " + sonuc);
    }
    public static int binarySearch(int[] dizi, int ilk, int son, int aranan){

        if (ilk <= son) {
            int orta = (ilk + son) / 2;
            if (dizi[orta] == aranan)
                return orta;
            else if (dizi[orta] > aranan)
                return binarySearch(dizi, ilk, orta - 1, aranan);
            else
                return binarySearch(dizi, orta + 1, son, aranan);
        }
        return -1;
    }
}
