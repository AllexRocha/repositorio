package desafio;

import java.util.Scanner;

public class Questao1 {

	public int npontos;

	public String geraDegrau() {

		if (this.npontos == 0) {
			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite o valor de n: ");

			this.npontos = entrada.nextInt();

			entrada.close();
		}
//
		String degrau = "";

		for (int i = 0; i < npontos; i++) {

			for (int j = npontos - 1; j >= 0; j--) {

				if ((i - j) >= 0) {
					degrau += "*";
				} else {
					degrau += " ";
				}

			}

			if (i < npontos - 1) {
				degrau += "\n";
			}

		}

		System.out.print(degrau);

		return degrau;
	}

}
