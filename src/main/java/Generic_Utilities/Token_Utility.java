package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Token_Utility{

	private static String bearerToken;
	 private static final String PROPERTIES_FILE = "src/main/resources/Config.properties";

	    public static String getBearerToken() {
	        Properties properties = new Properties();
	        try (FileInputStream fileInputStream = new FileInputStream(PROPERTIES_FILE)) {
	            properties.load(fileInputStream);
	            return properties.getProperty("bearer_token");
	        } catch (IOException e) {
	            System.out.println("Failed to read properties file: " + e.getMessage());
	            return null;
	        }
	    }
	}