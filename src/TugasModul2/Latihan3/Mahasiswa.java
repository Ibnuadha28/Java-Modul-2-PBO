package TugasModul2.Latihan3;

public class Mahasiswa {
    public String nama = "Juuno";
    public String status = "Dalam ikatan";
    public int semester = 3;

    public void getStatus(){
        System.out.println("Nama\t\t\t: " + nama +"\n"
                + "Status\t\t\t: " + status+"\n"
                + "Semester\t\t: " + semester);
    }
}
