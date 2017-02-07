package core;

import core.entities.Droits;
import core.entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		User user2 = new User();
		
		Droits droit1 = new Droits();
		Droits droit2 = new Droits();
		Droits droit3 = new Droits();
		Droits droit4 = new Droits();
		
		user1.getDroits().add(droit1);
		user1.getDroits().add(droit2);
		user2.getDroits().add(droit3);
		user2.getDroits().add(droit4);
		
	}

}