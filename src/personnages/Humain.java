package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	private String prendreparole() {
		return "(" + nom +  ")-" ;
		
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		System.out.println(prendreparole() + "Bonjour ! Je m'appelle " + nom + " et j'aime "
				+ "boire du " + boisson);
		
	}
	
	public void boire() {
		System.out.println( prendreparole() + "Mmmm, un bon verre de " + 
	boisson + " ! GLOUPS!");
		
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain; 
	}	
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole() + texte);
		
	}
	
	public void acheter(String bien, int prix) {
		if(prix > argent) {
			parler("Je n'ai plus que " + argent + " sous en poche."
					+ "Je ne peux m�me pas m'offrir un " + bien + 
					" � " + prix + " sous ");
		}
		else {
			parler("J'ai" + argent + " sous en poche."
					+ "Je vais pouvoir m'offrir une " + bien + 
					" � " + prix + " sous ");		
			argent = argent-prix; 
		}
	}
	
	
	
	
	
	

}
