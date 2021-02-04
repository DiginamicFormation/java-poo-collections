package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/Temp/recensement.csv");
		List<String> lignes = Files.readAllLines(path);
		
		ArrayList<String> selection = new ArrayList<>();
		
		for (int i=1; i<lignes.size(); i++) {
			
			String ligne = lignes.get(i);
			String[] morceauxLignes = ligne.split(";");
			
			int nbPopulation = Integer.parseInt(morceauxLignes[9].replaceAll(" ", ""));
			if (nbPopulation > 25000) {
				
				String ligneSortie = morceauxLignes[6]+";"+morceauxLignes[0]+";"+nbPopulation;
				selection.add(ligneSortie);
			}
		}

		Path pathDestination = Paths.get("C:/Temp/selection25000.csv");
		Files.write(pathDestination, selection);
	}

}
