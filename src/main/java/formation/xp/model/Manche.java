package formation.xp.model;

import java.util.List;

public class Manche {
    private int number;
    private List<Tour> listeTour;

    Manche(int number){
        number=this.number;
    }

    public void initManche(List<Joueur> listeJoueur){
        for (Joueur joueur : listeJoueur) {
            Tour tour = new Tour(joueur,this.maxLancé());
            listeTour.add(tour);
        }
    }

    public int play(){
        for (Tour tour : listeTour){
            tour.play();
            tour.print();
        }


        return 0;
    }


    public int maxLancé(){
        if (this.number==10) {
            return 3;
        } else {
            return 2;
        }
    }

}
