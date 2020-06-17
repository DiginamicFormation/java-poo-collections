package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import sets.entites.Pays;

/** TP n°3 sur les maps: Exercice 3
 * @author RichardBONNAMY
 *
 */
public class MapPays {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		Set<Pays> set = new HashSet<>();
		set.add(new Pays("France", 69_861_344, 43551));
		set.add(new Pays("Allemagne", 82_801_531, 50206));
		set.add(new Pays("UK", 63_421_628, 43620));
		set.add(new Pays("Italie", 61_302_519, 37970));
		set.add(new Pays("Japon", 124_856_424, 42659));
		set.add(new Pays("USA", 328_239_523, 62606));
		set.add(new Pays("Chine", 1_408_089_559, 16624));
		set.add(new Pays("Russie", 126_434_660, 27900));
		set.add(new Pays("Inde", 1_386_249_417, 5174));
		
		// Alimentation de la map
		HashMap<String, Pays> mapPays = new HashMap<>();
		for (Pays pays: set) {
			mapPays.put(pays.getNom(), pays);
		}
		
		// Recherche et suppression du pays qui a le moins d'habitants
		Pays paysMin = mapPays.values().iterator().next();
		for (Pays pays : mapPays.values()) {
			if (pays.getPopulation() < paysMin.getPopulation()) {
				paysMin = pays;
			}
		}
		mapPays.remove(paysMin.getNom());
		
		// Affichage après suppression
		System.out.println("\n---------------------------------");
		for (Pays pays : mapPays.values()) {
			System.out.println(pays);
		}
	}

}
