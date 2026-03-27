package companies.interview.questions;

import lombok.*;


public class Team {

    private String pos;
    private String teamName;
    private double nrr;
    private int points;

    public Team(String pos, String teamName, double nrr, int points){
        this.pos = pos;
        this.teamName = teamName;
        this.nrr = nrr;
        this.points = points;
    }

    public String getPos() {
        return pos;
    }

    public String getTeamName() {
        return teamName;
    }

    public double getNrr() {
        return nrr;
    }

    public int getPoints() {
        return points;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setNrr(double nrr) {
        this.nrr = nrr;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Team{" +
                "pos='" + pos + '\'' +
                ", teamName='" + teamName + '\'' +
                ", nrr=" + nrr +
                ", points=" + points +
                '}';
    }
}
