package maps;

import java.util.HashMap;
import java.util.Map;

/** TP n°3 sur les maps: Exercice 1
 * @author RichardBONNAMY
 *
 */
public class CreationMap {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2750);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		System.out.println("Taille de la map :"+mapSalaires.size());
	}

}
