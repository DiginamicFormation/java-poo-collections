package maps;

import java.util.HashMap;
import java.util.Iterator;

/** TP n°3 sur les maps: Exercice 3
 * @author RichardBONNAMY
 *
 */
public class FusionMap {
	
	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String args[]) {
		
		// Création map1
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		//Alimentation d'une Map contenant la totalité des informations des map1 et map2
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		
		Iterator<Integer> iterator2 = map2.keySet().iterator();
		while (iterator2.hasNext()){
			Integer key2 = iterator2.next();
			String value2 = map2.get(key2);
			
			map3.put(key2,  value2);
		}
		System.out.println(map3);
		
	}
}