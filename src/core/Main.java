package core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import core.entities.Droits;
import core.entities.User;
import core.entities.Users;

public class Main {
	final static String RETURNCHAR = "\n";
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

		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		String user1Json = null;
		String user2Json = null;
		try {
			user1Json = ow.writeValueAsString(user1);
			user2Json = ow.writeValueAsString(user2);

		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Users usersOut = new Users();
		usersOut.getListeUsers().add(user1);
		usersOut.getListeUsers().add(user2);
		
		File usersJson = new File("users.json");
		
		if (usersJson.exists()) {
			usersJson.delete();
		}
		
		ObjectMapper mapper = new ObjectMapper();
		Users usersIn = null;	
		
		try {
			//Object to JSON in file
			mapper.writeValue(usersJson, usersOut);
			//JSON in file to Object
			usersIn = mapper.readValue(usersJson, Users.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		System.out.println(usersIn.getListeUsers().get(0).getNom());
	}

}