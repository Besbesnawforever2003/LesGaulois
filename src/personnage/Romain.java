package personnage;

public class Romain {
	 private String nom;
	 private int force;
	 
	 public Romain(String nom, int force) {
	 this.nom = nom;
	 this.force = force;
	 }
	 
	 public String getNom() {
	 return nom;
	 }
	 public void parler(String texte) {
		 System.out.println("Le romain " + nom + " : � " + texte + " �.");
	 }
	 public void recevoirCoup(int forceDuCoup) {
		 force -= forceDuCoup; 
		 if (force < 1) {
		 force = 0;
		 System.out.println("Le romain " + nom + " : � J'abandonne... �");
		 }
		 else {
		 System.out.println("Le romain " + nom + " : � A�e ! �");
		 }

	 }




}
