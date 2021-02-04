package tri.comparators.pays;

import java.util.Comparator;

import sets.entites.Pays;

public class ComparatorPibHabitant implements Comparator<Pays> {

	@Override
	public int compare(Pays p1, Pays p2) {
		if (p1.getPibHab() > p2.getPibHab()) {
			return 1;
		} else if (p1.getPibHab() < p2.getPibHab()) {
			return -1;
		}
		return 0;
	}

}
