package sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** TP n°2 sur les sets: Exercice 1
 * @author RichardBONNAMY
 *
 */
public class TestSetDouble {

	public static void main(String[] args) {
		Double[] tabEntiers = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
		
		Set<Double> setEntiers = new HashSet<>();
		setEntiers.addAll(Arrays.asList(tabEntiers));
		
		// Affichez tous les éléments de la collection
		System.out.println("Affichage de la collection :");
		for (Double d: setEntiers) {
			System.out.println(d);
		}
		
		// Recherchez le plus grand élément de la collection
		Double plusGrand = setEntiers.iterator().next();
		for (Double d: setEntiers) {
			if (d > plusGrand) {
				plusGrand = d;
			}
		}
		System.out.println("\nElément le plus grand : "+ plusGrand);
		
		// Supprimez le plus petit élément de la collection
		Double plusPetit = setEntiers.iterator().next();
		for (Double d: setEntiers) {
			if (d < plusPetit) {
				plusPetit = d;
			}
		}
		System.out.println("\nElément le plus petit :"+plusPetit);
		
		// Suppression de l'élément le plus petit
		setEntiers.remove(plusPetit);
		
		// Affichez enfin le contenu de la collection ainsi modifiée
		System.out.println("\nAffichage de la collection :");
		for (Double d: setEntiers) {
			System.out.println(d);
		}
	}

}
