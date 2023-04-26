package ForEach;

import java.util.ArrayList;
import java.util.Collections;

public class ExForEach {
	public static void main (String[] args) {
		String[] nomes = new String[3];
		
		nomes[0] = "Vitor";
		nomes[1] = "Guilherme";
		nomes[2] = "Lucas";
		
		ArrayList<String> listaNomes = new ArrayList<>();
		
		listaNomes.add(nomes[0]);
		listaNomes.add(nomes[1]);
		listaNomes.add(nomes[2]);

		Collections.sort(listaNomes);
		
		listaNomes.forEach((nom) -> {
			System.out.println(nom + " ");
		});
	}

}
