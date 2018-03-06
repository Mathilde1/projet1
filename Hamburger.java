package fr.burgers;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
	protected String nom;
	protected String pain;
	protected String viande;
	protected double prix;
	protected List<IngredientSup> ingredients = new ArrayList<>();
	protected int nombreMaxIngredients = 4;
	protected int positionAjoutIngredient;

	// Constructeurs
	public Hamburger(String nom, String pain, String viande, double prix) {
		super();
		this.nom = nom;
		this.pain = pain;
		this.viande = viande;
		this.prix = prix;
	}

	public Hamburger(String nom, String pain, double prix) {
		super();
		this.nom = nom;
		this.pain = pain;
		this.prix = prix;
		
	}

	// Méthodes
	public void ajouterIngredient(IngredientSup ingredient) {
		if (positionAjoutIngredient < nombreMaxIngredients) {
				ingredients.add(ingredient);
				positionAjoutIngredient++;
				prix = prix + ingredient.getPrixIngredient();
		}else {
			System.out.println("Vous avez atteint le nombre maximum d'ingrédients supplémentaires pour ce burger");
		}
	}
	
	// Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPain() {
		return pain;
	}

	public void setPain(String pain) {
		this.pain = pain;
	}

	public String getViande() {
		return viande;
	}

	public void setViande(String viande) {
		this.viande = viande;
	}

	public double getPrix() {
		return prix;
	}

	public List<IngredientSup> getIngredients() {
		return ingredients;
	}

}
