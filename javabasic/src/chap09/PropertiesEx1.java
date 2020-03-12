package chap09;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx1 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("timeout", "30");
		prop.setProperty("lang", "kr");
		prop.setProperty("size", "10");
		prop.setProperty("capa", "10");
		
		Enumeration e =prop.propertyNames();
		while(e.hasMoreElements()) {
			String element = (String)e.nextElement();
			System.out.println(element + "="+prop.getProperty(element));
			
		}
		
		Iterator it = (Iterator)prop.propertyNames();
		while(it.hasNext()) {
			String item = (String)it.next();
			System.out.println(item);
		}
		prop.setProperty("size", "20");

	}

}
