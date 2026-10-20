// File: MobilBox.java
public class MobilBox extends Armada {
    private int jumlahRoda;

    public MobilBox(String noPlat, String merk, double kapasitasKg, int jumlahRoda) {
        super(noPlat, merk, kapasitasKg);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public double hitungBiayaOperasional() {
        return (this.kapasitasKg * 25000) + (this.jumlahRoda * 50000);
    }

    @Override
    public void tampilkanInfoArmada() {
        System.out.println("[MOBIL BOX]");
        super.tampilkanInfoArmada();
        System.out.println("Jml Roda  : " + jumlahRoda);
        System.out.println("Biaya/Hari : Rp " + String.format("%,.2f", hitungBiayaOperasional()));
    }
}