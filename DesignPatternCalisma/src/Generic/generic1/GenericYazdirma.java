package Generic.generic1;

public class GenericYazdirma <E> {
    public void yazdir(E[] dizi){
        for (E c: dizi) {
            System.out.println(c);
        }
    }
}
