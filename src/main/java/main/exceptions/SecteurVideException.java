package main.exceptions;

public class SecteurVideException extends Exception {

	public SecteurVideException() {
		super("Le secteur est d�j� vide, vous ne pouvez pas enlever d'animal.");
	}
}
