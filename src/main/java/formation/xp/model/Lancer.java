package formation.xp.model;

public class Lancer {
    private int score;
    private int borne;

    public Lancer( int borne ) {
        this.score = Des.getInstance().lancer(borne);
        this.borne = borne;
    }

    public int getScore() {
        return this.score;
    }

    public int getBorne() {
        return this.borne;
    }

}
