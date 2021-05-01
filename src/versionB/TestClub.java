package versionB;

public class TestClub {
	public static void main(String[] args) {

		Club club1 = new Club("CCIs 2020");

		club1.lister();

		club1.ajouterMembre("An", "Ap");
		club1.ajouterMembre("Bn", "Bp");
		club1.ajouterMembre("Cn", "Cp");


		club1.lister();

		club1.trouverMembre("An", "Ap").ajouterSport(Sports.NATATION);
		club1.trouverMembre("An", "Ap").ajouterSport(Sports.RANDONNEE);
		club1.trouverMembre("Bn", "Bp").ajouterSport(Sports.RUGBY);

		club1.lister();

	}
}
