package main;

import java.util.ArrayList;

import main.exceptions.SecteurVideException;

public class Secteur implements Comparable<Secteur> {

	private TypeAnimal typeAnimauxDansSecteur;
	private ArrayList<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	public Secteur(TypeAnimal typeAnimal) {
		typeAnimauxDansSecteur = typeAnimal;
	}

	public void ajouterAnimal(Animal animal) {
		animauxDansSecteur.add(animal);
	}
	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	public TypeAnimal obtenirType() {
		return typeAnimauxDansSecteur;
	}

	public void retirerAnimal() throws SecteurVideException {
		if(animauxDansSecteur.size() <= 0) throw new SecteurVideException();
		animauxDansSecteur.remove(animauxDansSecteur.size() - 1);
	}

	@Override
	public int compareTo(Secteur o) {
		return getNombreAnimaux() - o.getNombreAnimaux();
	}	
}
