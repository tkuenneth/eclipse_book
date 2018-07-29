package com.thomaskuenneth.systempropertyviewer;

import java.util.Enumeration;
import java.util.Properties;

public class SystemPropertyViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printProperties();
		System.exit(0);
	}

	private static void printProperties() {
		Properties p = System.getProperties();
		Enumeration<Object> e = p.keys();
		while (e.hasMoreElements()) {
			String key = (String) e.nextElement();
			System.out.println(String.format("%s=%s", key, p.getProperty(key)));
		}
	}
}
