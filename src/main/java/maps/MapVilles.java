package maps;

import java.util.HashMap;
import java.util.Iterator;

import listes.entites.Ville;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<>();
		mapVilles.put("Nice", new Ville("Nice", 343_000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47_800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53_400));
		mapVilles.put("Lyon", new Ville("Lyon", 484_000));
		mapVilles.put("Foix", new Ville("Foix", 9_700));
		mapVilles.put("Pau", new Ville("Pau", 77_200));
		mapVilles.put("Marseille", new Ville("Marseille", 850_700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40_600));
		mapVilles.put("Pau", new Ville("Pau", 77_200));
		
		// Initialisation de la ville la moins peuplée. Par défaut
		// on lui donne la valeur de la première ville de la Map.
		String cleRemove = mapVilles.keySet().iterator().next();
		Ville villeRemove = mapVilles.get(cleRemove);
		
		Iterator<String> iterCles = mapVilles.keySet().iterator();
		while (iterCles.hasNext()) {
			String cle = iterCles.next();
			Ville villeCourante = mapVilles.get(cle);
			if (villeCourante.getNbHabitants() < villeRemove.getNbHabitants()) {
				villeRemove = villeCourante;
				cleRemove = cle;
			}
		}
		
		// Suppression
		System.out.println("Suppression de la ville la moins peuplée: "+villeRemove);
		mapVilles.remove(cleRemove);
		
		// Affichage
		for (Ville v: mapVilles.values()) {
			System.out.println(v);
		}

	}

}
