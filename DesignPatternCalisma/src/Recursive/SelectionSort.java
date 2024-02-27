package Recursive;

public class SelectionSort {

    public static void main(String[] args) {
        int[] dizi = {3,11,45,4,1,9};
        int[] siralanmisDizi = selectionSort(dizi,dizi.length);
        for(int i = 0; i<siralanmisDizi.length;i++) System.out.print(siralanmisDizi[i] + " ");
    }
    public static int[] selectionSort(int[] dizi, int boyut){
        if (boyut ==1) return dizi;
        int max = 0;
        for (int i = 1; i<boyut; i++){
            if (dizi[i]>dizi[max]) max = i;
        }
        int gecici= dizi[boyut-1];
        dizi[boyut-1] = dizi[max];
        dizi[max] = gecici;

        return selectionSort(dizi,boyut-1);

    }
}
