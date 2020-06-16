package interfaces;

/** TP sur les interfaces
 * @author RichardBONNAMY
 *
 */
public class TestObjetGeometrique {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		// Création du tableau d'objets géométriques
		ObjetGeometrique[] objets = new ObjetGeometrique[2];
		objets[0] = new Cercle(2.0);
		objets[1] = new Rectangle(5.0, 10.0);
		
		// Affichage du périmètre et de la surface de chaque objet du tableau
		for (int i=0; i<objets.length; i++) {
			System.out.println("Périmètre :"+objets[i].perimetre());
			System.out.println("Surface :"+objets[i].surface());
		}
	}
}
