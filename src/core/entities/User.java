package core.entities;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	@Override
	public String toString() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Imcomprehensible fatal error !";
		}
	}

	String nom;
	String prenom;
	String login;
	String motDePass;
	List<Droits> droits;
	
	public User() {
		this.droits = new ArrayList<Droits>();
	
	}
	
	public User(String nom, String prenom, String login, String motDePass) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePass = motDePass;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}

	public List<Droits> getDroits() {
		return droits;
	}

	public void setDroits(List<Droits> droits) {
		this.droits = droits;
	}

	
	
}
