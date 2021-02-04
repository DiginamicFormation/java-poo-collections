package tri.comparators.villes;

import java.util.Comparator;

import maps.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	private boolean asc;
	
	public ComparatorHabitant() {
		this.asc = true;
	}
	
	public ComparatorHabitant(boolean asc) {
		super();
		this.asc = asc;
	}
	
	@Override
	public int compare(Ville ville1, Ville ville2) {
		
		if (asc) {
			if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
				return 1;
			}
			else if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
				return -1;
			}
		}
		else {
			if (ville1.getNbHabitants() > ville2.getNbHabitants()) {
				return -1;
			}
			else if (ville1.getNbHabitants() < ville2.getNbHabitants()) {
				return 1;
			}
		}
		return 0;
	}

}
