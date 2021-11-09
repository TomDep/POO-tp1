package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.exceptions.SecteurVideException;

public class SecteurComparableTest {

	@Test
	public void test() throws SecteurVideException {
		Secteur s1 = new Secteur(TypeAnimal.Chien);
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		
		// 2 Chats
		Secteur s2 = new Secteur(TypeAnimal.Chat);
		s2.ajouterAnimal(new Chat());
		s2.ajouterAnimal(new Chat());
		
		// Il y a plus d'animaux dans le secteur 1 que le secteur 2
		assertTrue(s1.compareTo(s2) > 0);
		
		// Enlever 2 animaux dans le secteur 1
		s1.retirerAnimal();
		s1.retirerAnimal();
		
		// Nombre d'animaux identiques
		assertTrue(s1.compareTo(s2) == 0);
		
		// Retirer un animal du secteur 1
		s1.retirerAnimal();
		
		// Il y a pluy d'animaux dans le secteur 2 que dans le secteur 1
		assertTrue(s1.compareTo(s2) < 0);
	}
}
