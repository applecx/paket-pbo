// File: KurirTetap.java
public class KurirTetap extends Kurir implements AksesSistem, PresensiDigital {
    private double gajiPokok;
    private double bonusPerPaket;

    public KurirTetap(String idKurir, String nama, int jumlahPaketTerkirim, double gajiPokok, double bonusPerPaket) {
        super(idKurir, nama, jumlahPaketTerkirim);
        this.gajiPokok = gajiPokok;
        this.bonusPerPaket = bonusPerPaket;
    }

    @Override
    public double hitungGaji() {
        return this.gajiPokok + (this.jumlahPaketTerkirim * this.bonusPerPaket);
    }

    @Override
    public void login(String username, String password) {
        System.out.println("[SYS-LOGIN] Kurir Tetap " + nama + " berhasil masuk ke Dashboard Internal.");
    }

    @Override
    public void logout() {
        System.out.println("[SYS-LOGOUT] Kurir Tetap " + nama + " keluar dari sistem.");
    }

    @Override
    public void rekamKehadiran() {
        System.out.println("[PRESENSI] Kurir " + nama + " merekam kehadiran fingerprint kantor.");
    }

    @Override
    public void cetakLaporanKehadiran() {
        System.out.println("[REKAP] Laporan kehadiran Kurir Tetap " + nama + ": 100% Hadir.");
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("=== KURIR TETAP ===");
        super.tampilkanProfil();
        System.out.println("Gaji Pokok : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("TOTAL GAJI : Rp " + String.format("%,.2f", hitungGaji()));
    }
}