package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestAgregDepartement {

	public static void main(String[] args) {
		List<Ville> liste = new ArrayList<>();
		liste.add(new Ville("Nice", 343_000, "06"));
		liste.add(new Ville("Carcassonne", 47_800, "11"));
		liste.add(new Ville("Narbonne", 53_400, "11"));
		liste.add(new Ville("Lyon", 484_000, "69"));
		liste.add(new Ville("Foix", 9_700, "09"));
		liste.add(new Ville("Pau", 77_200, "64"));
		liste.add(new Ville("Marseille", 850_700, "13"));
		liste.add(new Ville("Tarbes", 40_600, "65"));
		liste.add(new Ville("Bayonne", 55_000, "64"));
		
		// Pour agréger par numéro de département: on va créer une hashMap
		// en clé: le numéro de département
		// en valeur: la population du département
		
		HashMap<String, Integer> mapPopulation = new HashMap<>();
		
		for (int i=0; i<liste.size(); i++) {
			
			Ville ville = liste.get(i);
			String numDept = ville.getDepartement();
			
			// Je regarde dans ma map s'il y a un compteur pour le numéro de dépt de la ville
			Integer compteur = mapPopulation.get(numDept);
			if (compteur==null) {
				compteur = ville.getNbHabitants();
			}
			else {
				compteur += ville.getNbHabitants();
			}
			mapPopulation.put(numDept, compteur);
		}
		
		System.out.println(mapPopulation);

	}
}
