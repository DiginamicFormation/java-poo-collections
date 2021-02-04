package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import sets.entites.Pays;
import tri.comparators.pays.ComparatorHabitant;
import tri.comparators.pays.ComparatorPibHabitant;

public class TestTriPays {

	public static void main(String[] args) {

		/*
		 * Exercice 1
		 */
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

		// Tri d'une collection de pays
		List<Pays> listePays = new ArrayList<>();
		listePays.addAll(set);
		
		// Implémentez la méthode compareTo de manière à ce que le tri se fasse sur le nom du pays (par ordre alphabétique)
		Collections.sort(listePays);
		
		// Affichez le résultat final après tri
		System.out.println("\n----------------------------------------TRI avec méthode compareTo");
		for (Pays paysCourant: listePays) {
			System.out.println(paysCourant);
		}
		
		/*
		 * Exercice 2: impossible de présenter dans ce correctif une classe Pays avec 2 méthodes compareTo différentes.
		 * Il ne peut y en avoir qu'une.
		 */
		
		
		/*
		 * Exercice 3
		 */
		// Créez une classe ComparatorHabitant qui implémente l’interface Comparator<Pays>. 
		// et triez en utilisant ce comparator
		Collections.sort(listePays, new ComparatorHabitant());
		
		// Affichez le résultat final après tri
		System.out.println("\n---------------------------------------- TRI sur population");
		for (Pays paysCourant: listePays) {
			System.out.println(paysCourant);
		}
		
		// Créez une classe ComparatorHabitant qui implémente l’interface Comparator<Pays>. 
		// et triez en utilisant ce comparator
		Collections.sort(listePays, new ComparatorPibHabitant());
		
		// Affichez le résultat final après tri
		System.out.println("\n---------------------------------------- TRI sur PIB.HAB");
		for (Pays paysCourant: listePays) {
			System.out.println(paysCourant);
		}
	}

}
