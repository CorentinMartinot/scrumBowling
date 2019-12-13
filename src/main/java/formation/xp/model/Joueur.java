package formation.xp.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Joueur {

	public Joueur() {
		this.score = 0;
		this.nom = "";
	}
	public Joueur(String nom) {
		this.nom = nom;
		this.score = 0;
	}
	
	/* ATTRIBUTS */
	
	private String nom;
	private int score;
	
	/* METHODS */
	
	public boolean setFilterName(String nom)
	{
		Pattern pattern = Pattern.compile("^[a-zA-Z]");
		Matcher matcher = pattern.matcher(nom);
		if (!matcher.find()) {
			return false;
		}
		setNom(nom);
		return true;

	}

	public void addScore(int quilles1, int quilles2) {
		setScore(this.score + quilles1 + quilles2);
	}
	
	/* GETTER */
	
	public String getNom()
	{
		return nom;
	}
	public int getScore() { return score; }
	
	/* SETTER */
	
	protected void setNom(String nom)
	{
		this.nom = nom;
	}
	protected void setScore(int score) { this.score = score; }
	
}
