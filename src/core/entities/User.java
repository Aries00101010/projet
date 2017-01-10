package entities;

import java.util.ArrayList;
import java.util.List;

public class test {
	String nom;
	String prenom;
	String login;
	String motDePass;
	List<String> droits;
	
	public User() {
		this.droits = new ArrayList<String>();
	}
}
