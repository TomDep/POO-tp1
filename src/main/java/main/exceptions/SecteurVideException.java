package main.exceptions;

public class SecteurVideException extends Exception {

	public SecteurVideException() {
		super("Le secteur est déjà vide, vous ne pouvez pas enlever d'animal.");
	}
}
