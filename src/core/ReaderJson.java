package core;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import core.entities.Configuration;
import core.entities.Users;

public class ReaderJson {
	ObjectMapper mapper;	
	
	public ReaderJson() {
		mapper = new ObjectMapper();
	}
	
	public Configuration readFileJson(File file) {
		Configuration configuration = null;
		try {
			configuration = mapper.readValue(file, Configuration.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return configuration;
	}
}
