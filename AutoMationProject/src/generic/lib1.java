package generic;

import java.io.FileInputStream;
import java.util.Properties;

public class lib1 implements IAutoConstant1{
	
	public static String getproperties(String CONFIG_PATH, String key) {
		String property="";
		Properties prop = new Properties();
		try{
			prop.load(new FileInputStream(CONFIG_PATH));
			property=prop.getProperty(key);
		}
		catch(Exception e) {
			
		}
		return property;
	}
}
