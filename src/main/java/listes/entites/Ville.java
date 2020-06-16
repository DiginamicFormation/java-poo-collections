package listes.entites;

/** Représente une ville
 * @author RichardBONNAMY
 *
 */
public class Ville {

	/** nom */
	private String nom;
	
	/** Nombre d'habitants */
	private int nbHabitants;

	/** Constructeur
	 * @param nom nom
	 * @param nbHabitants nombre d'habitants
	 */
	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "Nom=" + nom + ", Habitants=" + nbHabitants;
	}

	/** Getter
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/** Setter
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}
	
	
}
