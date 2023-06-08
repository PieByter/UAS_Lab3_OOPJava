// Turunan kelas PerangkatElektronik (Inheritance)
public class Smartphone extends PerangkatElektronik {
    private String sistemOperasi;

    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    //Polymorphism : Overloading constructor
    public Smartphone() {
        this("Iphone 14 Pro", "Apple", "IOS");
    }
    public Smartphone(String nama) {
        this(nama, "Unknown", "Android");
    }
    public Smartphone(String nama,String merek) {
        this(nama, merek, "Unknown");
    }
    public Smartphone(String nama, String merek, String sistemOperasi) {
        super(nama, merek); // super keyword untuk mengakses constructor dari kelas parent
        this.sistemOperasi = sistemOperasi;
    }

    @Override
    public void nyalakan() {
        System.out.println("Menyalakan " + getNama() + " " + getMerek());
        System.out.println("Sistem Operasi: " + sistemOperasi);
    }

    @Override
    public void matikan() {
        System.out.println("Mematikan " + getNama() + " " + getMerek());
    }
}
