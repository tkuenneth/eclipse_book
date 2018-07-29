package com.thomaskuenneth.uiproperties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class UIProperties {

	public static void main(String[] args) {
		UIDefaults uiDefaults = UIManager.getDefaults();
		Enumeration<Object> keys = uiDefaults.keys();
		String datei = "ausgabe.txt";
		try (FileWriter fw = new FileWriter(datei)) {
			while (keys.hasMoreElements()) {
				String key = keys.nextElement().toString();
				if ((args.length == 0) || (key.indexOf(args[0]) >= 0)) {
					fw.write(key.toString() + "\n");
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
