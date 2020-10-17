package TugasModul2.Latihan2;

public class DemoBinatang {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Ikan ikan = new Ikan();
        Kucing kucing = new Kucing();

        burung.getAct("Burung");
        burung.getBurung("Elang");
        ikan.getAct("Ikan");
        ikan.getIkan("Salmon");
        kucing.getAct("Kucing");
        kucing.getKucing("Angora");
    }
}
