package main;

import org.junit.Test;

import main.Secteur;
import main.TypeAnimal;
import main.exceptions.SecteurVideException;

public class SecteurVideExceptionTest {

	@Test(expected = SecteurVideException.class) 
	public void test() throws SecteurVideException {
		Secteur s = new Secteur(TypeAnimal.Chat);
		s.retirerAnimal();
	}

}
