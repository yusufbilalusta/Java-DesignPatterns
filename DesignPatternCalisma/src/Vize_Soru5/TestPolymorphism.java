// Vasıta arayüzü
interface Vasita {
    void hizlan();
    void fren();
}

// Otonom arayüzü
interface Otonom {
    void otonomHareket();
}

// Genel Vasıta sınıfı
abstract class GenelVasita implements Vasita {
    protected int hiz;

    public GenelVasita() {
        this.hiz = 0;
    }

    @Override
    public void hizlan() {
        System.out.println("Vasıta Hızlanıyor");
        this.hiz += 10;
    }

    @Override
    public void fren() {
        System.out.println("Vasıta Yavaşlıyor");
        this.hiz -= 10;
        if (this.hiz < 0) {
            this.hiz = 0;
        }
    }
}

// Araba sınıfı
class Araba extends GenelVasita implements Comparable<Araba> {
    public Araba() {
        super();
    }

    @Override
    public void hizlan() {
        super.hizlan();
        System.out.println("Araba Hızlanıyor");
        this.hiz += 20;
        if (this.hiz > 180) {
            this.hiz = 180;
        }
    }

    @Override
    public void fren() {
        super.fren();
        System.out.println("Araba Yavaşlıyor");
    }

    @Override
    public int compareTo(Araba arabalar) {
        return Integer.compare(this.hiz, arabalar.hiz);
    }
}

// Drone sınıfı
class Drone extends GenelVasita implements Otonom, Comparable<Drone> {
    public Drone() {
        super();
    }

    @Override
    public void hizlan() {
        super.hizlan();
        System.out.println("Drone Hızlanıyor");
        this.hiz += 5;
        if (this.hiz > 90) {
            this.hiz = 90;
        }
    }

    @Override
    public void fren() {
        super.fren();
        System.out.println("Drone Yavaşlıyor");
    }

    @Override
    public void otonomHareket() {
        System.out.println("Drone otonom uçabiliyor");
    }

    @Override
    public int compareTo(Drone dronlar) {
        return Integer.compare(this.hiz, dronlar.hiz);
    }
}

// Elektrikli süpürge sınıfı
class ElektrikliSuperge extends GenelVasita implements Otonom {
    @Override
    public void hizlan() {
        super.hizlan();
        System.out.println("Elektrikli Süpürge Hızlanıyor");
    }

    @Override
    public void fren() {
        super.fren();
        System.out.println("Elektrikli Süpürge Yavaşlıyor");
    }

    @Override
    public void otonomHareket() {
        System.out.println("Kendi süpürebiliyor");
    }
}

// Şoför sınıfı
class Sofor {
    private String ad;

    public Sofor(String ad) {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }
}

// Araba sınıfından türetilmiş ŞoförlüAraba sınıfı
class SoforluAraba extends Araba {
    private Sofor sofor;

    public SoforluAraba(Sofor sofor) {
        super();
        this.sofor = sofor;
    }

    public Sofor getSofor() {
        return sofor;
    }

    public void setSofor(Sofor sofor) {
        this.sofor = sofor;
    }
}

// Test sınıfı
public class TestPolymorphism {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        Drone drone1 = new Drone();
        ElektrikliSuperge elektrikliSuperge1 = new ElektrikliSuperge();
        Sofor sofor1 = new Sofor("Şoför 1");
        SoforluAraba soforluAraba1 = new SoforluAraba(sofor1);


        Araba araba2 = new Araba();
        araba2.hizlan();
        int i = araba1.compareTo(araba2);
        System.out.println(i);

        araba1.hizlan();
        drone1.hizlan();
        elektrikliSuperge1.hizlan();

        araba1.fren();
        drone1.fren();
        elektrikliSuperge1.fren();

        drone1.otonomHareket();
        elektrikliSuperge1.otonomHareket();

        soforluAraba1.hizlan();
        System.out.println("Şoför: " + soforluAraba1.getSofor().getAd());

        // Aynı şoförü tekrar atamaya çalışma kontrolü
        Sofor sofor2 = new Sofor("Şoför 2");
        soforluAraba1.setSofor(sofor2);
        System.out.println("Yeni Şoför: " + soforluAraba1.getSofor().getAd());
    }
}
