package formation.xp.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Joueur {
	
	/* ATTRIBUTS */
	
	private String nom;
	
	/* METHODS */
	
	public boolean filterName(String nom)
	{
		Pattern pattern = Pattern.compile("^[a-zA-Z]");
		Matcher matcher = pattern.matcher(nom);
		if (!matcher.find()) {
			setNom(nom);
			return true;
		}
		return false;
	}
	
	/* GETTER */
	
	public String getNom()
	{
		return nom;
	}
	
	/* SETTER */
	
	protected void setNom(String nom)
	{
		this.nom = nom;
	}
	
	
}
