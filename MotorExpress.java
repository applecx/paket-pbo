// File: MotorExpress.java
public class MotorExpress extends Armada {
    private boolean isGanjilGenap;

    public MotorExpress(String noPlat, String merk, double kapasitasKg, boolean isGanjilGenap) {
        super(noPlat, merk, kapasitasKg);
        this.isGanjilGenap = isGanjilGenap;
    }

    @Override
    public double hitungBiayaOperasional() {
        return this.kapasitasKg * 15000;
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("[MOTOR EXPRESS]");
        super.tampilkanInfoArmada();
        System.out.println("Akses Genap: " + (isGanjilGenap ? "Ya" : "Tidak"));
        System.out.println("Biaya/Hari : Rp " + String.format("%,.2f", hitungBiayaOperasional()));
    }
}