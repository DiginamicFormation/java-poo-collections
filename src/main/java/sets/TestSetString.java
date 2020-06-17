package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** TP n°2 sur les sets: Exercice 2
 * @author RichardBONNAMY
 *
 */
public class TestSetString {

	/** Méthode exécutable
	 * @param args non utilisé ici
	 */
	public static void main(String[] args) {
		String[] tabNoms = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
		Set<String> listeNoms = new HashSet<>();
		listeNoms.addAll(Arrays.asList(tabNoms));

		//Recherchez le pays dans cette liste qui a le plus grand nombre de lettres
		String nomMaxLettres = listeNoms.iterator().next();
		for (String nom: listeNoms) {
			if (nom.length() > nomMaxLettres.length()) {
				nomMaxLettres = nom;
			}
		}
		System.out.println("Nom du pays avec le plus de lettres :"+nomMaxLettres);
		
		listeNoms.remove(nomMaxLettres);
		
		// Affichage après suppression
		System.out.println("\nAffichage après suppression du pays ayant le plus de lettres:");
		for (String nom: listeNoms) {
			System.out.println(nom);
		}
	}

}
