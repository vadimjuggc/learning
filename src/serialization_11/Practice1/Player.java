package serialization_11.Practice1;

import java.io.Serializable;

public class Player implements Serializable {
    private  int score;
    private String name;
    private double totalTime;

    public Player(int score, String name, double totalTime) {
        this.score = score;
        this.name = name;
        this.totalTime = totalTime;
    }

    public int getScore() {
        return score;
    }
}
