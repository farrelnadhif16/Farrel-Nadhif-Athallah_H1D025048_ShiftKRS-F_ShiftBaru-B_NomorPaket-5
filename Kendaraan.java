public abstract class Kendaraan {

    public static final int BIAYA_ADMIN = 3500;

    private String merk;
    private final String nomorPolisi;
    private boolean sudahDiservis;

    public Kendaraan(String merk, String nomorPolisi) {
        this.merk = merk;
        this.nomorPolisi = nomorPolisi;
        this.sudahDiservis = false;
    }

    public Kendaraan(String nomorPolisi) {
        this("Tidak diketahui", nomorPolisi);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public boolean isSudahDiservis() {
        return sudahDiservis;
    }

    public void setSudahDiservis(boolean sudahDiservis) {
        this.sudahDiservis = sudahDiservis;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Plat Nomor: " + nomorPolisi);
    }

    public abstract void lakukanServis();
}