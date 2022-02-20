package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio.Questao1;

class Questao1Test {

	@Test
	void testGeraDegrau() {

		Questao1 questao1 = new Questao1();

		int resultadoEsperado_1 = 64;

		questao1.npontos = 8;

		String degrau = questao1.geraDegrau();

		int resultado = degrau.length();

		// Verifica se a string formada tem o mesmo numero de pontos
		// na horizontal e vertical -> erro: se não for
		assertTrue((resultado - (questao1.npontos - 1)) == resultadoEsperado_1);

		// Verifica se ocorre salto de linha no último ponto
		// erro : se ocorre o salto
		assertTrue((degrau.charAt(degrau.length() - 1)) != '\n');
	}

}
