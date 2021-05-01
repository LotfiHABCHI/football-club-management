package versionA;

public abstract class TestSports {

	public static void main(String[] args) {

		int liste[] = new int[3];

		liste[0] = Sports.NATATION;
		liste[1] = Sports.TENNIS;
		liste[2] = Sports.ATHLETISME;

		for (int sport = 0; sport < liste.length; sport++)
			System.out.println(Sports.nom(liste[sport]));

	}

}
