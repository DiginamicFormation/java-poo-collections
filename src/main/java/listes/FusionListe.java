package listes;

import java.util.ArrayList;
import java.util.List;

/** Exercice sur les listes: Exercice 2
 * @author RichardBONNAMY
 *
 */
public class FusionListe {
	
	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String args[]) {
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		// Fusion des 2 listes
		List<String> listeTotale = new ArrayList<String>();

		// Ajout contenu liste 1 dans listeTotale
		for (String str : liste1) {
			listeTotale.add(str);
		}

		// Ajout contenu liste 2 dans listeTotale
		for (String str : liste2) {
			listeTotale.add(str);
		}
		
		// Affichage liste résultante
		System.out.println(listeTotale);
	}
}