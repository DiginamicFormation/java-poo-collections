package tri.comparators.villes;

import java.util.Comparator;

import maps.Ville;

public class ComparatorNom implements Comparator<Ville> {

	private boolean asc;
	
	public ComparatorNom(boolean asc) {
		super();
		this.asc = asc;
	}

	@Override
	public int compare(Ville ville1, Ville ville2) {
		
		if (asc) {
			return ville1.getNom().compareTo(ville2.getNom());
		}
		else {
			return -ville1.getNom().compareTo(ville2.getNom());
		}
	}

}
