package main.exceptions;

import org.junit.Test;

import main.Chien;
import main.Secteur;
import main.TypeAnimal;
import main.Zoo;

public class AnimalDansMauvaisSecteurExceptionTest {

	@Test(expected = AnimalDansMauvaisSecteurException.class)
	public void test() throws AnimalDansMauvaisSecteurException {
		Zoo zoo = new Zoo();	
		
		Secteur s = new Secteur(TypeAnimal.Chat);
		zoo.ajouterSecteur(s);
		zoo.nouvelAnimal(new Chien());		
	}

}
