package formation.xp.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tour {
    private int maxLancé;
    private List<Lance>;
    private Joueur joueur;

    Tour(Joueur joueur, int maxLancé){
        this.maxLancé=maxLancé;
        this.joueur=joueur;
    }

    public int play(){
        System.out.println("C'est au tour de "+joueur.getNom());
        String s="";
        do {
            System.out.println("'o' pour lancer le dé  // '/q' pour quitter le jeu");
            try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                s = br.readLine();
            } catch (IOException e){
                System.out.println(e);
            }
        } while(s.equals("o")||s.equals("/q"));

        if (s.equals("/q")){
            return 1;
        } else if(s.equals("o")){
            Lance lance = new Lance();
            lance.play();
        }




        return 0;
    }


}