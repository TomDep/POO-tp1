package main;

@SuppressWarnings("serial")
public class AnimalDansMauvaisSecteurException extends Exception {

	public AnimalDansMauvaisSecteurException() {
		super("L'animal entré est dans la mauvaise section !");
	}
	
}
