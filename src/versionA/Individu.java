package versionA;

public class Individu {
	private String nom;
	private String prenom;

	private boolean[] sportsPratiques;

	public Individu(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		this.sportsPratiques = new boolean[Sports.NB_SPORTS];

	}

	public String getNom() {
		return nom;

	}

	public String getPrenom() {
		return prenom;
	}

	public boolean pratique(int sport) {
		return (sportsPratiques[sport]);
	}

	public void ajouterSport(int sport) {
		sportsPratiques[sport] = true;
	}

	public void enleverSport(int sport) {
		sportsPratiques[sport] = false;
	}

	private int getNbSports() {
		int nbsport = 0;
		for (int pos = 0; pos < sportsPratiques.length; pos++) {
			if (sportsPratiques[pos] == true) {
				nbsport += 1;
			}
		}
		return nbsport;
	}

	public int[] sportsPratiques() {
		int[] sportPrat = new int[getNbSports()];
		int pos = 0;
		for (int i = 0; i < Sports.NB_SPORTS; i++) {
			if (pratique(i)) {
				sportPrat[pos] = i;
				pos++;
			}
		}
		return sportPrat;
	}
	
	public String toString() {
		String res="";
		res+= "Nom : "+getNom()+"\n";
		res+= "Prenom : "+getPrenom()+"\n";
		res+="Nombre de sports pratiqués : " +getNbSports()+"\n";
		res+= "Liste des sports: ";
		
		for (int sport : sportsPratiques()) {
			res+=Sports.nom(sport)+" ";
		}

		res+="\n";
		return res;
	}

	public boolean equals(Individu m) {
		return this.nom == m.nom && this.prenom == m.prenom;
	}
}
