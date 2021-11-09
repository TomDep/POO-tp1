package main.exceptions;

import org.junit.Test;

import main.Chien;
import main.Secteur;
import main.TypeAnimal;
import main.Zoo;

public class AnimalDansMauvaisSecteurExceptionTest {

	@Test
	public void test() {
		Zoo zoo = new Zoo();	
		
		Secteur s = new Secteur(TypeAnimal.Chat);
		zoo.ajouterSecteur(s);
		try {
			zoo.nouvelAnimal(new Chien());
			assert(false);
		} catch (AnimalDansMauvaisSecteurException e) {
			e.printStackTrace();
			assert(true);
		}
	}

}
