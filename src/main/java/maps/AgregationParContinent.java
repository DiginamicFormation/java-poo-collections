package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import maps.entites.Pays;

/** Démonstration d'une agrégation avec utilisation d'une MAP.
 * <br>
 * L'idée dans cette classe est de montrer comment calculer la population par continent en partant d'un
 * Set de pays dont on connait le continent d'appartenance ainsi que la population respective.
 * <br>
 * @author RichardBONNAMY
 *
 */
public class AgregationParContinent {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		Set<Pays> set = new HashSet<>();
		set.add(new Pays("France", "Europe", 69_861_344, 43551));
		set.add(new Pays("Allemagne", "Europe", 82_801_531, 50206));
		set.add(new Pays("UK", "Europe", 63_421_628, 43620));
		set.add(new Pays("Italie", "Europe", 61_302_519, 37970));
		set.add(new Pays("Japon", "Asie", 124_856_424, 42659));
		set.add(new Pays("USA", "Amérique", 328_239_523, 62606));
		set.add(new Pays("Chine", "Asie", 1_408_089_559, 16624));
		set.add(new Pays("Russie", "Europe", 126_434_660, 27900));
		set.add(new Pays("Inde", "Asie", 1_386_249_417, 5174));

		/* Map destinée à calculer la population par continent
		 * - La clé de type String va permettre de stocker le nom du continent
		 * - La valeur de type Long va représenter la population totale du continent
		 * 
		 * Au départ cette Map est vide !!
		 */
		Map<String, Long> mapContinents = new HashMap<>();
		
		// On parcourt la liste de pays
		for (Pays pays: set) {
			
			// Comme la map de départ est vide, je suis obligé de regarder pour chaque pays si
			// la valeur de population du continent a été initialisée ou non. 
			// Cas 1: la population du continent n'a pas été initialisée
			if (mapContinents.get(pays.getContinent())==null) {
				
				// je créé la valeur en l'initialisant avec la population du pays courant
				mapContinents.put(pays.getContinent(), (long)pays.getPopulation());
			}
			// Cas 2: la population du continent a été initialisée => on ajoute la pop du pays 
			// à celle du continent
			else {
				long population = mapContinents.get(pays.getContinent());
				mapContinents.put(pays.getContinent(), population+pays.getPopulation());
			}
		}
		
		// Parcourt final pour tout afficher: nom du continent et population calculée
		Iterator<String> iterator = mapContinents.keySet().iterator();
		while (iterator.hasNext()) {
			String nomContinent = iterator.next();
			System.out.println(nomContinent+ ": " +mapContinents.get(nomContinent));
		}
		
	}
}
