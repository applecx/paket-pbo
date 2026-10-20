// File: KurirMitra.java
public class KurirMitra extends Kurir implements PresensiDigital {
    private double upahPerPaket;

    public KurirMitra(String idKurir, String nama, int jumlahPaketTerkirim, double upahPerPaket) {
        super(idKurir, nama, jumlahPaketTerkirim);
        this.upahPerPaket = upahPerPaket;
    }

    @Override
    public double hitungGaji() {
        return this.jumlahPaketTerkirim * this.upahPerPaket;
    }

    @Override
    public void rekamKehadiran() {
        System.out.println("[PRESENSI MOBILE] Kurir Mitra " + nama + " presensi via GPS Mobile App.");
    }

    @Override
    public void cetakLaporanKehadiran() {
        System.out.println("[REKAP] Log aktivitas pengiriman harian Mitra " + nama + " tersimpan.");
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("=== KURIR MITRA (FREELANCE) ===");
        super.tampilkanProfil();
        System.out.println("Upah/Paket : Rp " + String.format("%,.2f", upahPerPaket));
        System.out.println("TOTAL GAJI : Rp " + String.format("%,.2f", hitungGaji()));
    }
}