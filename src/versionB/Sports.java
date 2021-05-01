package versionB;

public class Sports {

	public static final int TENNIS = 0;
	public static final int NATATION = 1;
	public static final int ATHLETISME = 2;
	public static final int VOLLEY = 3;
	public static final int RUGBY = 4;
	public static final int BASKET = 5;
	public static final int RANDONNEE = 6;
	public static final int NB_SPORTS = 7;

	public static String nom(int sport) {

		switch (sport) {
		case TENNIS:
			return "Tennis";
		case NATATION:
			return "Natation";
		case ATHLETISME:
			return "Athlétisme";
		case VOLLEY:
			return "Volley";
		case RUGBY:
			return "Rugby";
		case BASKET:
			return "Basket";
		case RANDONNEE:
			return "Randonnée";

		}
		return "Pas de sport";

	}

}
