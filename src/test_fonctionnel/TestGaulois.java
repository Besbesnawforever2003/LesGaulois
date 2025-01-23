package test_fonctionnel;

import personnage.Gaulois;
import personnage.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());
		asterix.parler("Bonjour a tous");
		Romain minus=new Romain("Minus",6);
		minus.parler("UN GAU... UN GAUGAU...");
		for (int i = 1; i <= 3; i++) {
            asterix.frapper(minus);
        }
	}
}
