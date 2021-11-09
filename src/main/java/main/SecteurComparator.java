package main;

import java.util.Comparator;

public class SecteurComparator implements Comparator<Secteur> {

	@Override
	public int compare(Secteur o1, Secteur o2) {		
		return o1.getNombreAnimaux() - o2.getNombreAnimaux();
	}
 
}
