package personnage;

public class Gaulois {

	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix.getNom());
	}
	 public void parler(String texte) {
		 System.out.println("Le gaulois " + nom + " : � " + texte + " �.");
	}
	 public void frapper(Romain romain) {
		 System.out.println("Le gaulois " + nom + " envoie un grand coup dans la m�choire de " + romain.getNom() + ".");
		 romain.recevoirCoup(force / 3);
		 }
}