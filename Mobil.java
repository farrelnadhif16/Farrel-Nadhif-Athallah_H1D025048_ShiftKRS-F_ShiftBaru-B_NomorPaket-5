public class Mobil extends Kendaraan implements BisaDiservis, BisaDiperiksa {

    public Mobil(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan: Mobil");
        super.tampilkanInfo();
    }

    @Override
    public void lakukanServis() {
        if (!isSudahDiservis()) {
            System.out.println("Mobil sedang diservis");
            setSudahDiservis(true);
        } else {
            System.out.println("Mobil sudah diservis");
        }
    }

    @Override
    public void servis() {
        lakukanServis();
    }

    @Override
    public void periksa() {
        System.out.println("Mobil sedang diperiksa");
    }
}