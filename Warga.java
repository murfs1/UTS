public class Warga {
    private String nama;
    private int jumlahBeras;
    private int jumlahUang;

    public Warga(String nama, int jumlahBeras, int jumlahUang) {
        this.nama = nama;
        this.jumlahBeras = jumlahBeras;
        this.jumlahUang = jumlahUang;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahBeras() {
        return jumlahBeras;
    }

    public int getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahBeras(int jumlahBeras) {
        this.jumlahBeras = jumlahBeras;
    }

    public void setJumlahUang(int jumlahUang) {
        this.jumlahUang = jumlahUang;
    }
}
