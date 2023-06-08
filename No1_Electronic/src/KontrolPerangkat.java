// Antarmuka untuk mengontrol perangkat elektronik
public interface KontrolPerangkat {
    void nyalakan() throws PerangkatException;

    void matikan();
}
