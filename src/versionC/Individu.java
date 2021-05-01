package versionC;

import java.util.TreeSet;


public class Individu {
	private String nom;
	private String prenom;

	private TreeSet<Integer> sportsPratiques;

	public Individu(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.sportsPratiques = new TreeSet<Integer>();

	}

	public String getNom() {
		return nom;

	}

	public String getPrenom() {
		return prenom;
	}

	public boolean pratique(int sport) {
		return (sportsPratiques.contains(sport));
	}

	public void ajouterSport(int sport) {
		sportsPratiques.add(sport);
	}

	public void enleverSport(int sport) {
		sportsPratiques.remove(sport);
	}

	private int getNbSports() {
		return sportsPratiques.size();
	}

//	public int[] sportsPratiques() {
//		int[] sportPrat = new int[getNbSports()];
//		int pos = 0;
//		for (int i = 0; i < Sports.NB_SPORTS; i++) {
//			if (sportsPratiques[i] == true) {
//				sportPrat[pos] = i;
//				pos++;
//			}
//		}
//		return sportPrat;
//	}

	public String toString() {
		String res="";
		res+= "Nom : "+getNom()+"\n";
		res+= "Prenom : "+getPrenom()+"\n";
		res+="Nombre de sports pratiqués : " +getNbSports()+"\n";
		res+= "Liste des sports: ";
		
		for (int sport : sportsPratiques) {
			res+=Sports.nom(sport)+" ";
		}

		res+="\n";
		return res;
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o.getClass() != getClass())
			return false;
		Individu autre = (Individu) o;
		return autre.nom == nom && autre.prenom == prenom;
	}
}
