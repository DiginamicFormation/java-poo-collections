package interfaces;

/** Représente un rectangle.
 * 
 * @author RichardBONNAMY
 *
 */
public class Rectangle implements ObjetGeometrique {
	
	/** largeur */
	private double largeur;
	
	/** longueur */
	private double longueur;

	/** Constructeur
	 * @param largeur largeur
	 * @param longueur longueur
	 */
	public Rectangle(double largeur, double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double perimetre() {
		return 2.0 * (longueur + largeur);
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	/** Getter
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/** Setter
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/** Getter
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/** Setter
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
