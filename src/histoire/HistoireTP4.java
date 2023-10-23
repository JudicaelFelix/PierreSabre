package histoire;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain Joris = new Humain("joris", 54, "kombucha");
		Joris.direBonjour();
		Joris.acheter("boisson", 12);
		Joris.boire();
		Joris.acheter("jeu", 2);
		Joris.acheter("Kimono", 50);
	}

	
	
}
