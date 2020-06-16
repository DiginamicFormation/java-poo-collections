package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/** Exercice sur les listes: Exercice 4
 * @author RichardBONNAMY
 *
 */
public class TestListeString {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		String[] array = {"Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Lyon", "Tarbes", "Nice"};
		List<String> nomVilles = new ArrayList<>();
		nomVilles.addAll(Arrays.asList(array));
		
		// Recherchez la ville dans cette liste qui a le plus grand nombre de lettres
		String villePlusGrandNbDeLettres = nomVilles.get(0);
		for (String nomVille: nomVilles) {
			if (nomVille.length()>villePlusGrandNbDeLettres.length()) {
				villePlusGrandNbDeLettres = nomVille;
			}
		}
		System.out.println("Nom de ville ayant le plus de lettres : "+villePlusGrandNbDeLettres);
		
		// Modifiez le contenu de la liste de manière à mettre tous les noms de villes en majuscules.
		for (int i=0; i<nomVilles.size(); i++) {
			String nomVille = nomVilles.get(i);
			String nomVilleMaj = nomVille.toUpperCase();
			nomVilles.set(i, nomVilleMaj);
		}
		
		System.out.println("\nMise en majuscules de tous les noms de villes:");
		nomVilles.forEach(ville -> System.out.println(ville));
		
		// Supprimez de la liste les villes dont le nom commence par la lettre N.
		Iterator<String> iterator = nomVilles.iterator();
		while (iterator.hasNext()) {
			String nomVille = iterator.next();
			if (nomVille.startsWith("N")) {
				iterator.remove();
			}
		}
		
		System.out.println("\nAffichage après suppression des noms de villes commençant par N:");
		nomVilles.forEach(ville -> System.out.println(ville));
	}

}
