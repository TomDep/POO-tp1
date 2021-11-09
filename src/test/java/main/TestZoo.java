package main;

import org.junit.Test;

import main.Animal;
import main.Chien;
import main.TypeAnimal;
import main.Zoo;
import main.exceptions.AnimalDansMauvaisSecteurException;
import main.exceptions.LimiteVisiteurException;

public class TestZoo {

	@Test(expected = LimiteVisiteurException.class)
	public void testLimiteVisiteursDepassee() throws LimiteVisiteurException {
		Zoo zoo = new Zoo();
		
		// Le zoo poss�de 1 seul secteur
		zoo.ajouterSecteur(TypeAnimal.Chat);

		// La limite de visiteurs devrait �tre 15
		for(int i=0; i < 16; i++) {
			zoo.nouveauVisiteur();
		}		
	}
	
	@Test
	public void testAnimalDansBonSecteur() {
		Zoo zoo = new Zoo();
		
		// Cr�ation d'un secteur de "chiens"
		zoo.ajouterSecteur(TypeAnimal.Chien);
		
		// Ajout d'un chien
		Animal chien = new Chien();
		try {
			zoo.nouvelAnimal(chien);
			assert(true);
		} catch (AnimalDansMauvaisSecteurException e) {
			assert(false);
		}
	}
}
