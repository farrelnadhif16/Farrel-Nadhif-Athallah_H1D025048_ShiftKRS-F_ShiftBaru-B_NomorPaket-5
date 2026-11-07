public class Motor extends Kendaraan implements BisaDiservis {

    public Motor(String merk, String nomorPolisi) {
        super(merk, nomorPolisi);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Jenis Kendaraan: Motor");
        super.tampilkanInfo();
    }

    @Override
    public void lakukanServis() {
        if (!isSudahDiservis()) {
            System.out.println("Motor sedang diservis");
            setSudahDiservis(true);
        } else {
            System.out.println("Motor sudah diservis");
        }
    }

    @Override
    public void servis() {
        lakukanServis();
    }
}