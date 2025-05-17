public class Mahasiswa {
    String nim, nama, keperluan;

    public Mahasiswa(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Keperluan: " + keperluan);
    }
}
