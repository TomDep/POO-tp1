package main.exceptions;

@SuppressWarnings("serial")
public class LimiteVisiteurException extends Exception {

	public LimiteVisiteurException() {
		super("Le nombre de visiteurs a atteint sa limite !");
	}
}
