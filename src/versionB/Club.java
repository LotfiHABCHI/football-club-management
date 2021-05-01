package versionB;

import java.util.ArrayList;

public class Club {

	private String nom;
	private ArrayList<Individu> membres;

	public Club(String nom) {
		this.nom = nom;
		this.membres = new ArrayList<Individu>();
	}

	public Individu trouverMembre(String nom, String prenom) {
		Individu recherche = new Individu(nom, prenom);
		int pos = membres.indexOf(recherche);
		if (pos == -1) {
			return null;
		}
		return membres.get(pos);

	}

	public Individu ajouterMembre(String nom, String prenom) {
		Individu nouveau = new Individu(nom, prenom);
		if (trouverMembre(nom, prenom) == null) {
			membres.add(nouveau);
			return nouveau;
		}
		return trouverMembre(nom, prenom);
	}

	public String toString() {
		return "Club: " + nom;
	}

	public void lister() {
		System.out.println("nom  du club:" + nom);
		for (int pos = 0; pos < membres.size(); pos++) {
			System.out.print(membres.get(pos));

		}
		System.out.println();

	}

}
