package Demo_Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Demo_FileUtility {

	 public String getPropertyKeyValue(String key) throws Throwable {
    	 FileInputStream fis = new FileInputStream("./data/commonData.properties");
    	 Properties pobj = new Properties();
    	 pobj.load(fis);
    	 String value = pobj.getProperty(key);
		return value;
	 }
}
