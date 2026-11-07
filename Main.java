public class Main {

    public static void main(String[] args) {

        // Membuat objek kendaraan
        Mobil mobil = new Mobil("Toyota", "R 1234 AB");
        Motor motor = new Motor("Honda", "R 5678 CD");

        // Menampilkan informasi kendaraan
        System.out.println("--> DATA KENDARAAN <--");
        mobil.tampilkanInfo();
        motor.tampilkanInfo();

        // Polimorfisme menggunakan interface
        System.out.println("\n-- PEMERIKSAAN --");
        BisaDiperiksa pemeriksaan = mobil;
        pemeriksaan.periksa();

        // Multiple interface dan servis
        System.out.println("\n-- PROSES SERVIS --");
        BisaDiservis servisMobil = mobil;
        BisaDiservis servisMotor = motor;

        servisMobil.servis();
        servisMotor.servis();

        // Menguji kondisi if/else
        System.out.println("\n-- CEK STATUS SERVIS --");
        mobil.lakukanServis();
        motor.lakukanServis();

        // Menampilkan biaya administrasi
        System.out.println("\nBiaya Administrasi: Rp"
                + Kendaraan.BIAYA_ADMIN);
    }
}