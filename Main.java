import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian Sekarang");
            System.out.println("7. Jumlah Mahasiswa Selesai KRS");
            System.out.println("8. Jumlah Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("10. Cek Antrian Kosong");
            System.out.println("11. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println("Jumlah antrian saat ini: " + antrian.getJumlahAntrian());
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa selesai KRS: " + antrian.getJumlahDiproses());
                    break;
                case 8:
                    System.out.println("Sisa mahasiswa yang belum KRS: " + antrian.getSisaKRS());
                    break;
                case 9:
                    antrian.clearQueue();
                    break;
                case 10:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian Kosong. ");
                    } else {
                        System.out.println("Antrian Tidak Kosong. ");
                    }
                    break;
                case 11:
                    if (antrian.isFull()) {
                        System.out.println("Antrian Sudah Penuh. ");
                    } else {
                        System.out.println("Antrian Tidak Penuh. ");
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
        sc.close();
    }
}
