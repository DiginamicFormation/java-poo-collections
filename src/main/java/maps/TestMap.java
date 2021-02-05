package maps;

import java.util.HashMap;
import java.util.Iterator;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, String> dico = new HashMap<>();
		dico.put("coder", "Mettre en code ; procéder au codage de");
		dico.put("sympathique", "Qui est en relation, en affinité avec (autre chose).");
		dico.put("volubile", "Qui parle avec abondance, rapidité.");
		
		
		System.out.println(dico.get("volubile"));
		System.out.println(dico.get("coder"));
		System.out.println(dico.get("sympathique"));
		
		/*
		 *  1	Ain
			2	Aisne
			3	Allier
			34	Hérault
			37	Indre et Loire
			44	Pays de la Loire
		 */
		HashMap<Integer, String> departements = new HashMap<>();
		departements.put(1, "Ain");
		departements.put(2, "Aisne");
		departements.put(3, "Allier");
		departements.put(34, "Hérault");
		departements.put(37, "Indre et Loire");
		departements.put(44, "Pays de la Loire");
		
		System.out.println(departements.get(37));
		
		// Pour boucler sur les clés des départements
		Iterator<Integer> iterCles = departements.keySet().iterator();
		while (iterCles.hasNext()) {
			Integer cle = iterCles.next();
			System.out.println(cle);
		}
		
		// Pour boucler sur les valeurs des départements
		Iterator<String> iterValeurs = departements.values().iterator();
		while (iterValeurs.hasNext()) {
			String nomDepartement = iterValeurs.next();
			System.out.println(nomDepartement);
		}

	}

}
