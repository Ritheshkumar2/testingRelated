package utilstwo;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties {
	
	private static Properties prop;
	
	static {
		try {
			if(prop == null) {
				FileInputStream fis=new FileInputStream("");
				prop=new Properties();
				prop.load(fis);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getProperty(String key) {
		return prop.getProperty(key);
	}
	
	//usage//ConfigProperties.getProperty("value");

}
