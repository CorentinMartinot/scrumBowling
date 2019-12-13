package formation.xp;

import formation.xp.model.Des;
import exception.NavigationException;

import formation.xp.model.Joueur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
	
    @Test
    public void test_aaa() {
        assertTrue(true);
    }

    @Test()
    public void goToCreateGameTest() {
        
        assertTrue(false);
    }
    
    @Test
    public void test_nom_joueur() {

    	String nom = "ab";
    	String nom2 = "@ab/";
    	Joueur joueur = new Joueur();
    	assertTrue(joueur.setFilterName(nom));
    	assertTrue(!joueur.setFilterName(nom2));
    }

    @Test
    public void test_random_generator() {
        Des des = Des.getInstance();
        int i = 0;
        while ( i < 90) {
            if (!((des.lancer(10) <= 10) && (des.lancer(10) >=0))) {
                assertTrue(false);
            }
            i += 1;
        }
        
        i = 0;
        
        while ( i < 90) {
            if (!((des.lancer(5) <= 10) && (des.lancer(5) >=0))) {
                assertTrue(false);
            }
            i += 1;
        }
        
        assertTrue(true);

    }

    @Test
    public void test_add_Score()
    {
        Joueur joueur = new Joueur();
        joueur.addScore(5,2);
        assertTrue(joueur.getScore() == 7);
        joueur.addScore(10,0);
        assertTrue(joueur.getScore() == 17);

    }
}

