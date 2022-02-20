package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import desafio.Questao3;

class Questao3Test {

	@Test
	void testPermutar() {
		Questao3 questao3 = new Questao3();
		
		
		String palavrapermutada = "RLATSAPEIA";
		
		assertTrue(questao3.permutar("PASTELARIA").contains(palavrapermutada));
	}

	@Test
	void testAnagrama() {
		
		Questao3 questao3 = new Questao3();
	
	
		questao3.palavra = "ifailuhkqq";
		
		assertTrue(questao3.anagrama().contains("[i,i]\n"
				+ "[q,q]\n"
				+ "[ifa,fai]"));
	}

}
