// File: Armada.java
public abstract class Armada {
    protected String noPlat;
    protected String merk;
    protected double kapasitasKg;

    public Armada(String noPlat, String merk, double kapasitasKg) {
        this.noPlat = noPlat;
        this.merk = merk;
        this.kapasitasKg = kapasitasKg;
    }

    // Abstract Method
    public abstract double hitungBiayaOperasional();

    public void tampilkanInfoArmada() {
        System.out.println("No. Plat: " + noPlat);
        System.out.println("Merk    : " + merk);
        System.out.println("Kapasitas : " + kapasitasKg + " Kg");
    }
}