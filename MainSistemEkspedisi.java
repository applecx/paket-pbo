import java.util.ArrayList;
import java.util.List;

public class MainSistemEkspedisi {
    public static void main(String[] args) {
        // Buat List<Armada> untuk menampung seluruh variasi armada
        List<Armada> daftarArmada = new ArrayList<>();

        // Menambahkan minimal 1 objek MotorExpress, MobilBox, dan DronePengirim
        daftarArmada.add(new MotorExpress("B 1234 ABC", "Honda Vario", 20.0, true));
        daftarArmada.add(new MobilBox("B 5678 XYZ", "Isuzu Elf", 1500.0, 6));
        daftarArmada.add(new DronePengirim("DRN-001", "DJI FlyCart 30", 30.0, 500));

        double totalBiayaOperasional = 0;

        System.out.println("==================================================");
        System.out.println("         DAFTAR FLEET & BIAYA OPERASIONAL         ");
        System.out.println("==================================================");

        // Perulangan untuk membuktikan polimorfisme
        for (Armada armada : daftarArmada) {
            armada.tampilkanInfoArmada(); // Memanggil method override sesuai tipe objek
            
            // Cek jika armada mengimplementasikan PresensiDigital
            if (armada instanceof PresensiDigital) {
                ((PresensiDigital) armada).rekamKehadiran();
            }

            totalBiayaOperasional += armada.hitungBiayaOperasional(); // Menghitung total biaya secara dinamis
            System.out.println("--------------------------------------------------");
        }

        // Tampilkan total keseluruhan biaya operasional per hari
        System.out.println("TOTAL BIAYA OPERASIONAL KESELURUHAN (PER HARI):");
        System.out.println("Rp " + String.format("%,.2f", totalBiayaOperasional));
        System.out.println("==================================================");
    }
}