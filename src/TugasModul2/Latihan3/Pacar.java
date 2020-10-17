package TugasModul2.Latihan3;

public class Pacar extends Mahasiswa {
    public String namaPacar = "Jenni";
    public String lamaHubungan = "5 Tahun";

    public void getStatus(){
        System.out.println("Nama\t\t\t: " + nama +"\n"
                + "Status\t\t\t: " + status+"\n"
                + "Semester\t\t: " + semester+"\n"
                + "Nama Pacar\t\t: " + namaPacar +"\n"
                + "Lama Hubungan\t: " + lamaHubungan + "\n");
    }
}
