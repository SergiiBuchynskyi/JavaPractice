package Football;

public class FootballTeams {

    public String name;
    public int gamesQuant, wins, draws, looses, points;


    public FootballTeams(String name) {
        this.name = name;
        this.gamesQuant = 0;
        this.wins = 0;
        this.draws = 0;
        this.looses = 0;
        this.points = 0;
    }//constructor


    public String toString() {
        return "FootballTeams{" +
                "name='" + name + '\'' +
                ", gamesQuant=" + gamesQuant +
                ", wins=" + wins +
                ", draws=" + draws +
                ", looses=" + looses +
                ", points=" + points +
                '}';
    } // toString



    public void gameHome(int score1, int score2){
        this.gamesQuant+=1;

        if (score1>score2){
            this.wins +=1;
        }else if (score1<score2){
            this.looses += 1;
        }else {
            draws+=1;
        }
        this.points += this.wins*3+this.draws;
    }




}