package versionA;

public class Club {

	private String nom;
	private Individu[] membres;
	private int nombreMembres;
	private int maxMembres;

	public Club(String nom) {
		this.nom = nom;
		this.nombreMembres = 0;
		this.maxMembres = 2;
		this.membres = new Individu[maxMembres];
	}

	public String toString() {
		return "Club: " + nom;
	}

	public Individu trouverMembre(String nom, String prenom) {
		Individu recherche = new Individu(nom, prenom);
		for (int pos = 0; pos < nombreMembres; pos++) {
			if (membres[pos].equals(recherche)) {
				return membres[pos];
			}
		}
		return null;
	}

	public void reconstructionMembresAvantAjout() { // Augmente la capacité de membres
		if (nombreMembres < maxMembres)
			return;
		Individu[] nvMembres = new Individu[maxMembres * 2];
		for (int pos = 0; pos < nombreMembres; pos++) {
			nvMembres[pos] = membres[pos];
		}
		membres = nvMembres;
		maxMembres = maxMembres * 2;
	}

	public Individu ajouterMembre(String nom, String prenom) {
		Individu nouveau = new Individu(nom, prenom);
		if (trouverMembre(nom, prenom) == null) {
			reconstructionMembresAvantAjout();
			membres[nombreMembres] = nouveau;
			nombreMembres++;
			return nouveau;
		}
		return trouverMembre(nom, prenom);
	}

	public void lister() {
		System.out.println("nom  du club:" + nom);
		for (int pos = 0; pos < nombreMembres; pos++) {
			System.out.print(membres[pos]);

		}
		System.out.println();

	}

}
