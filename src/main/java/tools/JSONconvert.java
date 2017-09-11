package tools;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;

import bookStore.service.BookServiceImpl;

public class JSONconvert {
	public static ObjectMapper mapper = new ObjectMapper();
	
	private static final Logger LOGGER = Logger.getLogger(BookServiceImpl.class);

	public <T> T readJSON(String jsonInString, Class<T> clazz) {
		T jsonClass = null;
		try {
			LOGGER.info("Reading JSON into Book");
			jsonClass = mapper.readValue(jsonInString, clazz);
		} catch (IOException e) {
			LOGGER.info("Reading JSON failed - IOException");
			e.printStackTrace();
		}
		return jsonClass;
	}
	
	public String writeJSON(Object obj) {
		LOGGER.info("Writing JSON from Book");
		String jsonOutString = "";
		try {
			LOGGER.info("Reading JSON into Book");
			jsonOutString = mapper.writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			LOGGER.info("Reading JSON into Book");
			e.printStackTrace();
		}
		return jsonOutString;
	}
}