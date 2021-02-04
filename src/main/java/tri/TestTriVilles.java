package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import maps.Ville;
import tri.comparators.villes.ComparatorHabitant;
import tri.comparators.villes.ComparatorNom;

public class TestTriVilles {

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Nice", 343_000, "06"));
		villes.add(new Ville("Carcassonne", 47_800, "11"));
		villes.add(new Ville("Narbonne", 53_400, "11"));
		villes.add(new Ville("Lyon", 484_000, "69"));
		villes.add(new Ville("Foix", 9_700, "09"));
		villes.add(new Ville("Pau", 77_200, "64"));
		villes.add(new Ville("Marseille", 850_700, "13"));
		villes.add(new Ville("Tarbes", 40_600, "65"));
		villes.add(new Ville("Bayonne", 55_000, "64"));
		
		// Tri basé sur la méthode compareTo
		Collections.sort(villes);
		
		for (Ville v: villes) {
			System.out.println(v);
		}
		
		System.out.println("------------------------------------------");
		// Tri basé sur l'utilisation du comparator ComparatorHabitant
		Collections.sort(villes, new ComparatorHabitant(true));
		
		for (Ville v: villes) {
			System.out.println(v);
		}
		
		System.out.println("------------------------------------------");
		// Tri basé sur l'utilisation du comparator ComparatorNom
		Collections.sort(villes, new ComparatorNom(false));
		
		for (Ville v: villes) {
			System.out.println(v);
		}
	}

}
