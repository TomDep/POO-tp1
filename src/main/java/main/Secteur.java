package main;

import java.util.ArrayList;

public class Secteur {

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
}
