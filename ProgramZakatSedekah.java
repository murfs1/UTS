import java.util.ArrayList;
import java.util.Scanner;

public class ProgramZakatSedekah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Warga> dataWarga = new ArrayList<>();
        int jumlahBerasZakat = 0;
        int jumlahUangZakat = 0;
        int jumlahUangSedekah = 0;
        
        System.out.print("Masukkan jumlah warga yang membayar zakat fitri: ");
        int jumlahWarga = input.nextInt();
        
        for (int i = 1; i <= jumlahWarga; i++) {
            System.out.println("Data Warga ke-" + i);
            System.out.print("Masukkan nama warga: ");
            String nama = input.next();
            System.out.print("Apakah warga membayar zakat fitri dengan beras atau uang? (1: Beras, 2: Uang): ");
            int pilihan = input.nextInt();
            int jumlahBeras = 0;
            int jumlahUang = 0;
            
            if (pilihan == 1) {
                System.out.print("Masukkan jumlah beras yang dibayar (kg): ");
                jumlahBeras = input.nextInt();
                jumlahBerasZakat += jumlahBeras;
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah uang yang dibayar (Rp): ");
                jumlahUang = input.nextInt();
                jumlahUangZakat += jumlahUang;
            } else {
                System.out.println("Pilihan tidak valid!");
                continue;
            }
            
            Warga warga = new Warga(nama, jumlahBeras, jumlahUang);
            dataWarga.add(warga);
        }
        
        System.out.println("=====================================");
        System.out.println("Jumlah warga yang membayar zakat fitri:");
        System.out.println("Beras: " + dataWarga.stream().filter(w -> w.getJumlahBeras() > 0).count());
        System.out.println("Uang: " + dataWarga.stream().filter(w -> w.getJumlahUang() > 0).count());
        System.out.println("=====================================");
        System.out.println("Jumlah beras dan uang zakat yang terkumpul:");
        System.out.println("Beras: " + jumlahBerasZakat + " kg");
        System.out.println("Uang: Rp " + jumlahUangZakat);
        System.out.println("=====================================");
        
        System.out.print("Masukkan jumlah uang sedekah yang terkumpul: ");
        jumlahUangSedekah = input.nextInt();
        System.out.println("Jumlah uang sedekah yang terkumpul: Rp " + jumlahUangSedekah);
        System.out.println("=====================================");
    }
}
