package versionB;



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
		for (int pos = 0; pos < Sports.NB_SPORTS; pos++) {
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
			if (sportsPratiques[i] == true) {
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

	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o.getClass() != getClass())
			return false;
		Individu autre = (Individu) o;
		return autre.nom == nom && autre.prenom == prenom;
	}
}
