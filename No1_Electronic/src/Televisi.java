// Turunan kelas PerangkatElektronik (Inheritance)
public class Televisi extends PerangkatElektronik {
    private int ukuranLayar;

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public Televisi(String nama, String merek, int ukuranLayar) {
        super(nama, merek); // super keyword untuk mengakses constructor dari kelas parent
        this.ukuranLayar = ukuranLayar;
    }
    // Polymorphism : Override method dari parent class
    @Override
    public void nyalakan() {
        System.out.println("Menyalakan " + getNama() + " " + getMerek());
        System.out.println("Ukuran Layar: " + ukuranLayar + " inci");
    }

    @Override
    public void matikan() {
        System.out.println("Mematikan " + getNama() + " " + getMerek());
    }
}