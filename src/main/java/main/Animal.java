package main;

public abstract class Animal {
	
	private String nomAnimal;
	private TypeAnimal typeAnimal;
	
	public Animal(String _nomAnimal, TypeAnimal _typeAnimal) {
		nomAnimal = _nomAnimal;
		typeAnimal = _typeAnimal;
	}
	public String getNomAnimal() {
		return nomAnimal;
	}
	public TypeAnimal getTypeAnimal() {
		return typeAnimal;
	}

}
