package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Config {
	
	private static Properties prop;
	//Static block runs EXACTLY ONE TIME — per JVM run
	//Even if you run 100 test cases → it still runs only once per JVM execution.
	//Loads only once, No need for object, Memory efficient, Thread-safe
	
	static {
		try {
			FileInputStream fis=new FileInputStream("C:/Users/hp/eclipse-workspace/testingRelated/src/test/resources/Configuration.properties");
			prop=new Properties();
			prop.load(fis);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		return prop.getProperty(key);
		
	}

}
