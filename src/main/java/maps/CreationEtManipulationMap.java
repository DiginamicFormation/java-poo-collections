package maps;

import java.util.HashMap;

/** TP n°3 sur les maps: Exercice 2
 * @author RichardBONNAMY
 *
 */
public class CreationEtManipulationMap {
	
	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String args[]) {
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		// Affichage de l'ensemble des clés
		System.out.println("Affichage de toutes les clés :");
		for (Integer key : mapVilles.keySet()) {
			System.out.println(key);
		}

		// Affichage de l'ensemble des clés
		System.out.println("\nAffichage de tous les noms de villes :");
		for (String nomVille : mapVilles.values()) {
			System.out.println(nomVille);
		}
	}
}