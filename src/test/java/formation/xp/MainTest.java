package formation.xp;

import exception.NavigationException;
import org.junit.jupiter.api.Test;

import formation.xp.model.Joueur;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import utils.NavigationState;

public class MainTest {


    @Test()
    public void goToCreateGameTest() {
        
        assertTrue(false);
    }
    
    public void test_nom_joueur() {
    	String nom = "@AZld,ks05é cdqs";
    	Joueur joueur = new Joueur();
    	assertTrue(!joueur.setFilterName(nom));
    }
}

