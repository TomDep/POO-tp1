package main;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {

	// Logger
	private static final Logger log = (Logger) LogManager.getLogger(App.class.getName());
	private Zoo zoo;

	public App() {
		BasicConfigurator.configure();
		
		zoo = new Zoo();	
		log.info("Nb d'animaux dans le zoo : " + zoo.getNbAnimaux());
	}

	public static void main(String[] args) {
		App app = new App();
	}

}
