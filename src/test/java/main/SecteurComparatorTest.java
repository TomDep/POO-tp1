package main;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.Chat;
import main.Chien;
import main.Secteur;
import main.SecteurComparator;
import main.TypeAnimal;
import main.exceptions.SecteurVideException;

public class SecteurComparatorTest {

	@Test
	public void test() throws SecteurVideException {

		// 4 Chiens
		Secteur s1 = new Secteur(TypeAnimal.Chien);
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		s1.ajouterAnimal(new Chien());
		
		// 2 Chats
		Secteur s2 = new Secteur(TypeAnimal.Chat);
		s2.ajouterAnimal(new Chat());
		s2.ajouterAnimal(new Chat());
		
		SecteurComparator comparator = new SecteurComparator();
		
		// Il y a plus d'animaux dans le secteur 1 que le secteur 2
		assertTrue(comparator.compare(s1, s2) > 0);
		
		// Enlever 2 animaux dans le secteur 1
		s1.retirerAnimal();
		s1.retirerAnimal();
		
		// Nombre d'animaux identiques
		assertTrue(comparator.compare(s1, s2) == 0);
		
		// Retirer un animal du secteur 1
		s1.retirerAnimal();
		
		// Il y a pluy d'animaux dans le secteur 2 que dans le secteur 1
		assertTrue(comparator.compare(s1, s2) < 0);
	}

}
