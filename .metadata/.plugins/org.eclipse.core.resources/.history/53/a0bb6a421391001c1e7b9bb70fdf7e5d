package desafio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// ################### Função para permutar####################
public class Questao3 {

	public String palavra;

	public static Set<String> permutar(String str) {
		Set<String> perm = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permutar(rem);
		for (String strNew : words) {
			for (int i = 0; i <= strNew.length(); i++) {
				perm.add(insertChar(strNew, initial, i));
			}
		}
		return perm;
	}

	public static String insertChar(String str, char c, int j) {
		String begin = str.substring(0, j);
		String end = str.substring(j);
		return begin + c + end;
	}
	// #############################################################3

	public String anagrama() {

		if (this.palavra == null) {
			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite a palavra: ");
			this.palavra = entrada.nextLine();

			entrada.close();
		}

		String aux, saida = "";

		int cont = 0;

		for (int h = 1; h < this.palavra.length(); h++) {

			for (int i = 0; i + h - 1 < this.palavra.length(); i++) {

				aux = this.palavra.substring(i, i + h);

				for (int j = i + 1; j + h - 1 < this.palavra.length(); j++) {

					if (permutar(this.palavra.substring(j, j + h)).contains(aux)) {
						cont++;
						saida += "[" + aux + "," + this.palavra.substring(j, j + h) + "]\n";
					}

				}

			}
		}

		System.out.printf("O número de pares de anagramas é %d\n%s", cont, saida);

		return saida;
	}

}
