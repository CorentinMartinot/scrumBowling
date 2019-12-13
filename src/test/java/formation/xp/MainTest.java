package formation.xp;

import org.junit.jupiter.api.Test;

import formation.xp.model.Joueur;

import static org.junit.jupiter.api.Assertions.assertTrue;

import utils.NavigationState;

public class MainTest {
    @Test
    public void test() {

        assertTrue(false);
    }
    
    public void test_nom_joueur() {
    	String nom = "@AZld,ks05é cdqs";
    	Joueur joueur = new Joueur();
    	assertTrue(!joueur.setFilterName(nom));
    }
}
