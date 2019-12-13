package formation.xp.model;

import java.util.List;

public class Partie {

    private List<Joueur> listeJoueur;
    private List<Manche> listeManche;

    public Partie(List<Joueur> listeJoueur){
        this.listeJoueur=listeJoueur;

    }

    public void initPartie(){
        for (int i =1; i<11;++i) {
            Manche manche = new Manche(i);
            manche.initManche(listeJoueur);
            listeManche.add(manche);
        }
    }

    public int lancerPartie(){
        System.out.println("La partie est lancé");
        for(Manche manche : listeManche){
            manche.play();
            manche.print();
        }
        //afficher gagnant



        return 0;
    }



}
