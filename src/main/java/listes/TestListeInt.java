package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Exercice sur les listes: Exercice 2
 * @author RichardBONNAMY
 *
 */
public class TestListeInt {

	/** Méthode exécutable
	 * @param args non utilisés ici
	 */
	public static void main(String[] args) {
		Integer[] array = {-1, 5, 7, 3, -2, 4, 8, 5};
		
		// Création de la liste
		List<Integer> liste = new ArrayList<>();
		liste.addAll(Arrays.asList(array));
		
		// Affichez tous les éléments de la liste
		System.out.println("Les éléments de la liste :");
		for (int entier: liste) {
			System.out.print(entier);
			System.out.print(" ");
		}
		
		// Saut de ligne
		System.out.println("\n");
		
		// Affichez la taille de la liste
		System.out.println("Taille de la liste :"+liste.size());
		
		// Saut de ligne
		System.out.println();
		
		// Recherchez et affichez le plus grand élément de la liste
		int max=Integer.MIN_VALUE;
		for (int entier: liste) {
			if (entier>max) {
				max=entier;
			}
		}
		System.out.println("Le maximum est égal à : "+max);
		
		// Recherchez et supprimez le plus petit élément de la liste
		int min=Integer.MAX_VALUE;
		for (int entier: liste) {
			if (entier<min) {
				min=entier;
			}
		}
		
		System.out.println("Le minimum est �gal � : "+min);
		
		// Suppression du min
		liste.remove(Integer.valueOf(min));
		
		// Positivez les éléments négatifs de la liste
		for (int i=0; i<liste.size(); i++) {
			if (liste.get(i)<0) {
				liste.set(i, -1 * liste.get(i));
			}
		}
		
		// Affichage
		System.out.println("Les �l�ments de la liste :");
		for (int entier: liste) {
			System.out.print(entier);
			System.out.print(" ");
		}
	}

}
