package core.entities;

import java.util.ArrayList;
import java.util.List;

public class Users {
	private List<User> users;
	
	public Users() {
		users = new ArrayList<User>();
	}

	public List<User> getListeUsers() {
		return users;
	}

	public void setListeUsers(List<User> listeUsers) {
		this.users = listeUsers;
	}
	
}
