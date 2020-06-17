package maps;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import maps.entites.Pays;

/** Cette classe montre l'utilisation de la {@link TreeMap} et de la {@link LinkedHashMap}
 * @author RichardBONNAMY
 *
 */
public class DifferentesMap {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		/*
		 * L'inconvénient de la TreeMap est que le tri se fait sur la clé et non 
		 * sur la valeur.
		 * 
		 * Exemple:
		 */
		Map<String, Pays> mapTrieeSurCles = new TreeMap<>();
		mapTrieeSurCles.put("a01", new Pays("France", "Europe", 69_861_344, 43551));
		mapTrieeSurCles.put("c04", new Pays("Allemagne", "Europe", 82_801_531, 50206));
		mapTrieeSurCles.put("a02", new Pays("UK", "Europe", 63_421_628, 43620));
		mapTrieeSurCles.put("c01", new Pays("Italie", "Europe", 61_302_519, 37970));
		mapTrieeSurCles.put("b01", new Pays("Japon", "Asie", 124_856_424, 42659));
		mapTrieeSurCles.put("b02", new Pays("USA", "Amérique", 328_239_523, 62606));
		mapTrieeSurCles.put("c03", new Pays("Chine", "Asie", 1_408_089_559, 16624));
		mapTrieeSurCles.put("c02", new Pays("Russie", "Europe", 126_434_660, 27900));
		mapTrieeSurCles.put("a03", new Pays("Inde", "Asie", 1_386_249_417, 5174));
		
		Iterator<String> keyIterator = mapTrieeSurCles.keySet().iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			System.out.println(key + " " + mapTrieeSurCles.get(key));
		}
		
		// Ligne de séparation
		System.out.println("\n------------------------------------------------");
		
		/*
		 * Une autre implémentation permet de préserver l'ordre d'insertion. 
		 * 
		 * C'est la LinkedHashMap
		 * 
		 * Exemple:
		 */
		Map<String, Pays> mapTrieeSurValeurs = new LinkedHashMap<>();
		mapTrieeSurValeurs.put("a01", new Pays("France", "Europe", 69_861_344, 43551));
		mapTrieeSurValeurs.put("c04", new Pays("Allemagne", "Europe", 82_801_531, 50206));
		mapTrieeSurValeurs.put("a02", new Pays("UK", "Europe", 63_421_628, 43620));
		mapTrieeSurValeurs.put("c01", new Pays("Italie", "Europe", 61_302_519, 37970));
		mapTrieeSurValeurs.put("b01", new Pays("Japon", "Asie", 124_856_424, 42659));
		mapTrieeSurValeurs.put("b02", new Pays("USA", "Amérique", 328_239_523, 62606));
		mapTrieeSurValeurs.put("c03", new Pays("Chine", "Asie", 1_408_089_559, 16624));
		mapTrieeSurValeurs.put("c02", new Pays("Russie", "Europe", 126_434_660, 27900));
		mapTrieeSurValeurs.put("a03", new Pays("Inde", "Asie", 1_386_249_417, 5174));
		
		Iterator<Pays> valueIterator = mapTrieeSurValeurs.values().iterator();
		while (valueIterator.hasNext()) {
			Pays pays = valueIterator.next();
			System.out.println(pays);
		}
	}

}
