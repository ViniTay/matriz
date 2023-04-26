package ForEach;

public class ExMatriz {

	public static void main(String[] args) {
		
		String nomeCompleto[][] =  new String[3][3];
		
		nomeCompleto[0][0] = "Vitor";
		nomeCompleto[0][1] = "Santos Fuci";
		
		nomeCompleto[1][0] = "Guilherme";
		nomeCompleto[1][1] = "Franco P";
		
		nomeCompleto[2][0] = "Lucas";
		nomeCompleto[2][1] = "Da Silva";
		
		for(int x = 0; x < nomeCompleto.length; x++ ) {
			System.out.println("Nomes da Linha: " + (x+1));
			System.out.println("" + nomeCompleto[x][0] + " " +
			nomeCompleto[x][1] + "\n");
		}
	}

}
