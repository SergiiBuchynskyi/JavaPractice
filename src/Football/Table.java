package Football;

public class Table {
    public static void main(String[] args) {

        FootballTeams brasil = new FootballTeams("brasil");
        FootballTeams croatia = new FootballTeams("croatia");


        FootballTeams[]footballTeams = {brasil,croatia};

        brasil.gameHome(3,2);
        System.out.println(brasil);
    }

}
