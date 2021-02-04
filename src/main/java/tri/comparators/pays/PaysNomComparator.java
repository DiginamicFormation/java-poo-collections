package tri.comparators.pays;

import java.util.Comparator;

import sets.entites.Pays;

public class PaysNomComparator implements Comparator<Pays>{

	@Override
	public int compare(Pays p1, Pays p2) {
		
		return p1.getNom().compareTo(p2.getNom());
	}

}
