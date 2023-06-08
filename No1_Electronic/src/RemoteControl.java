// Kelas yang mengimplementasikan antarmuka KontrolPerangkat
public class RemoteControl implements KontrolPerangkat {
    private PerangkatElektronik perangkat;

    public RemoteControl(PerangkatElektronik perangkat) {
        this.perangkat = perangkat;
    }

    @Override
    public void nyalakan() throws PerangkatException {
        perangkat.nyalakan();
    }

    @Override
    public void matikan() {
        perangkat.matikan();
    }
}
