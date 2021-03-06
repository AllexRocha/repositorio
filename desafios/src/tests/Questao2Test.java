package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio.Questao2;

class Questao2Test {

	@Test
	void testConfereSenha() {

		Questao2 questao2 = new Questao2();

		questao2.senha = "Aab@#123";

		String mensagem = questao2.confereSenha();

		// Teste de senha forte
		assertTrue(mensagem.contains("Atendeu os requisitos de senha forte"));

		questao2.senha = "123Aa";

		mensagem = questao2.confereSenha();

		// Teste de senha fraca
		assertTrue(mensagem.contains("Senha fraca") && mensagem.contains("6 caracteres")
				&& mensagem.contains("Um caractere especial !@#$%^&*()-+"));
	}

}
