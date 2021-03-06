package main;

import java.util.ArrayList;

import main.exceptions.AnimalDansMauvaisSecteurException;
import main.exceptions.LimiteVisiteurException;

public class Zoo {

	private int visiteurs = 0;
	private ArrayList<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	private int nbVisiteurMaxParSecteur = 15;
	
	public void ajouterSecteur(Secteur secteur) {
		secteursAnimaux.add(secteur);
	}
	
	public void nouveauVisiteur() throws LimiteVisiteurException {
		visiteurs++;
		
		if(visiteurs > getLimiteVisiteur()) throw new LimiteVisiteurException();
	}
	
	public int getLimiteVisiteur() {
		return nbVisiteurMaxParSecteur * secteursAnimaux.size();
	}
	
	public void nouvelAnimal(Animal animal) throws AnimalDansMauvaisSecteurException {
		TypeAnimal typeAnimal = animal.getTypeAnimal();
		
		for(Secteur secteur : secteursAnimaux) {
			if(secteur.obtenirType() == typeAnimal) {
				secteur.ajouterAnimal(animal);
				return;
			}
		}
		
		throw new AnimalDansMauvaisSecteurException();
	}

	public int getVisiteurs() {
		return visiteurs;
	}

	public int getNbAnimaux() {
		int n = 0;
		
		for(Secteur secteur : secteursAnimaux) {
			n += secteur.getNombreAnimaux();
		}
		return n;
	}
	
}
