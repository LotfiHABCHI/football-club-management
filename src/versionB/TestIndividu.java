package versionB;

public class TestIndividu {
	public static void main(String[] args) {
	
		Individu indivA=new Individu("An", "Ap");
		Individu indivB=new Individu("Bn", "Bp");
		Individu indivC=new Individu("An", "Ap");

		
		
		System.out.println(indivA);
		
		indivA.ajouterSport(Sports.NATATION);
		indivA.ajouterSport(Sports.TENNIS);
		
		indivB.ajouterSport(Sports.RUGBY);

		System.out.println(indivA);
		System.out.println(indivB);
		
	
		
		System.out.println(indivA.equals(indivB));
		System.out.println(indivA.equals(indivC));


	}
}
