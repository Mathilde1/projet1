package fr.burgers;

public class HealthyBurger extends Hamburger {
	
	// Constructeur
	public HealthyBurger(String nom, String pain, double prix) {
		super(nom, pain, prix);
	}
	
	// M�thodes
	public void ajouterIngredient(IngredientSup ingredient) {
		if (positionAjoutIngredient < nombreMaxIngredients + 2) {
				ingredients.add(ingredient);
				positionAjoutIngredient++;
				prix = prix + ingredient.getPrixIngredient();	
		}else {
			System.out.println("Vous avez atteint le nombre maximum d'ingr�dients suppl�mentaires pour ce burger");
		}
	}
	
}
