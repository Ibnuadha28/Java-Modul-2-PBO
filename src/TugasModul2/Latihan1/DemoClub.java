package TugasModul2.Latihan1;

public class DemoClub {
    public static void main(String[] args) {
        Club club1 = new Club();
        Club club2 = new Club("Real Madrid");
        Club club3 = new Club("Barcelona", "Klub Liga Spanyol");
        Club club4 = new Club("Manchester United", 1902, "Old Trafford");
        Club club5 = new Club("Liverpool", 1892, "Anfield", 2019, "You'll Never Walk Alone");

        club1.getTeam();
        club2.getTeam();
        club3.getTeam();
        club4.getTeam();
        club5.getTeam();
    }
}
