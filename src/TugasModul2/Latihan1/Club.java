package TugasModul2.Latihan1;

public class Club {
    public String nama;
    public int tahunBerdiri;
    public String stadion;
    public int juaraUcl;
    public String deskripsi;

    public Club(){
        this.nama = "TIDAK ADA KETERANGAN";
        this.tahunBerdiri = 0;
        this.stadion = "TIDAK ADA KETERANGAN";
        this.juaraUcl = 0;
        this.deskripsi = "TIDAK ADA KETERANGAN";
    }

    public Club(String nama) {
        this.nama = nama;
        this.tahunBerdiri = 0;
        this.stadion = "TIDAK ADA KETERANGAN";
        this.juaraUcl = 0;
        this.deskripsi = "TIDAK ADA KETERANGAN";
    }

    public Club(String nama, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = 0;
        this.stadion = "TIDAK ADA KETERANGAN";
        this.juaraUcl = 0;
        this.deskripsi = deskripsi;
    }

    public Club(String nama, int tahunBerdiri, String stadion) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = 0;
        this.deskripsi = "TIDAK ADA KETERANGAN";
    }

    public Club(String nama, int tahunBerdiri, String stadion, int juaraUcl, String deskripsi) {
        this.nama = nama;
        this.tahunBerdiri = tahunBerdiri;
        this.stadion = stadion;
        this.juaraUcl = juaraUcl;
        this.deskripsi = deskripsi;
    }

    public void getTeam() {
        System.out.println("Club\n" + "Nama\t\t\t: " + nama
                + "\n" + "Tahun Berdiri\t: " + tahunBerdiri
                + "\n" + "Stadion\t\t\t: " + stadion
                + "\n" + "Juara UCL\t\t: " + juaraUcl
                + "\n" + "Deskripsi\t\t: " + deskripsi + "\n");
    }
}
