// File: Kurir.java
public abstract class Kurir {
    protected String idKurir;
    protected String nama;
    protected int jumlahPaketTerkirim;

    public Kurir(String idKurir, String nama, int jumlahPaketTerkirim) {
        this.idKurir = idKurir;
        this.nama = nama;
        this.jumlahPaketTerkirim = jumlahPaketTerkirim;
    }

    public abstract double hitungGaji();

    public void tampilkanProfil() {
        System.out.println("ID Kurir  : " + idKurir);
        System.out.println("Nama      : " + nama);
        System.out.println("Total Paket : " + jumlahPaketTerkirim + " paket");
    }

    public String getNama() { return nama; }
    public String getIdKurir() { return idKurir; }
}