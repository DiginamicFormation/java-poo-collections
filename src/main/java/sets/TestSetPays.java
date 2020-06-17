package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import sets.entites.Pays;

/** TP n°2 sur les sets: Exercice 3
 * @author RichardBONNAMY
 *
 */
public class TestSetPays {

	/** Méthode exécutable
	 * @param args non utilisé ici
	 */
	public static void main(String[] args) {

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

		// Recherchez le pays avec le PIB/habitant le plus important
		Pays paysMax = set.iterator().next();
		for (Pays pays : set) {
			if (pays.getPibHab() > paysMax.getPibHab()) {
				paysMax = pays;
			}
		}
		System.out.println(paysMax);

		// Recherchez le pays avec le PIB total le plus important
		paysMax = set.iterator().next();
		for (Pays pays : set) {
			if (pays.getPibTotal() > paysMax.getPibTotal()) {
				paysMax = pays;
			}
		}
		System.out.println(paysMax);

		// Modifiez le contenu du HashSet pour mettre en majuscule le pays qui a le PIB
		// total le plus petit
		Pays paysMin = set.iterator().next();
		for (Pays pays : set) {
			if (pays.getPibHab() < paysMin.getPibHab()) {
				paysMin = pays;
			}
		}
		paysMin.setNom(paysMin.getNom().toUpperCase());

		// Supprimez le pays dont le PIB total est le plus petit
		paysMin = set.iterator().next();
		for (Pays pays : set) {
			if (pays.getPibTotal() < paysMin.getPibTotal()) {
				paysMin = pays;
			}
		}
		set.remove(paysMin);

		System.out.println("\n Affichage final:");
		// Affichage global
		Iterator<Pays> iterator = set.iterator();
		while (iterator.hasNext()) {
			Pays pays = iterator.next();
			System.out.println(pays);
		}

		// Tri d'une collection de pays
		List<Pays> maListe = new ArrayList<>();
		maListe.addAll(set);

		System.out.println(maListe);
	}

}
