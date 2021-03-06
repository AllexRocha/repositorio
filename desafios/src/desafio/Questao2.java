package desafio;

import java.util.Scanner;

public class Questao2 {

	public String senha;

	public String confereSenha() {

		String mensagem = "", char_esp = "!@#$%^&*()-+";

		if (this.senha == null) {
			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite a senha: ");

			this.senha = entrada.next();

			entrada.close();
		}

		int tam = senha.length();
		int contaux = 0;

		boolean verifica[] = new boolean[5];
		/*
		 * [0] -> tamanho mínimo [1] -> contém dígito [2] -> contém minúscula [3] ->
		 * contém maiúscula [4] -> contém caractere especial
		 */

		// verificando se contém tamanho mínimo
		if (tam >= 6)
			verifica[0] = true;

		for (int i = 0; i < tam; i++) {

			char c = senha.charAt(i);

			// verificando se contém 1 dígito
			if (Character.isDigit(c)) {
				verifica[1] = true;

			}

			// verificando se contém minuscula
			else if (Character.isLowerCase(c)) {
				verifica[2] = true;

			}

			// Verificando se contém maíuscula
			else if (Character.isUpperCase(c)) {
				verifica[3] = true;

			}

			else if (char_esp.contains(String.valueOf(c))) {
				verifica[4] = true;

			}

		}

		for (int i = 0; i < verifica.length; i++) {
			if (verifica[i] == false)
				contaux++;
		}
		if ((verifica[0] == false) && ((6 - tam) > 0))
			System.out.println(6 - tam);

		if (contaux == 0) {

			mensagem += "Atendeu os requisitos de senha forte";
		}

		else {
			mensagem += "Senha fraca faltam na senha no mínimo: \n";

			if (verifica[0] == false)
				mensagem += "-6 caracteres\n";

			if (verifica[1] == false)
				mensagem += "-Um digito 0 - 9\n";

			if (verifica[2] == false)
				mensagem += "-Um caractere minúsco a - z\n";

			if (verifica[3] == false)
				mensagem += "-Um caractere maiúsculo A - Z\n";

			if (verifica[4] == false)
				mensagem += "-Um caractere especial !@#$%^&*()-+\n";

		}
		
		System.out.println(mensagem);

		return mensagem;

	}

}
