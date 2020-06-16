package interfaces;

import static java.lang.Math.PI;

/** Représente un cercle
 * @author RichardBONNAMY
 *
 */
public class Cercle implements ObjetGeometrique {

	/** rayon */
	private double rayon;
	
	
	/** Constructeur
	 * @param rayon rayon du cercle
	 */
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2.0*PI*rayon;
	}

	@Override
	public double surface() {
		return PI*rayon*rayon;
	}

	/** Getter
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/** Setter
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
