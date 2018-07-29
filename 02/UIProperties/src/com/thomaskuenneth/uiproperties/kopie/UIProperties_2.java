package com.thomaskuenneth.uiproperties.kopie;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import javax.swing.UIDefaults;
import javax.swing.UIManager;

public class UIProperties_2 {

	private static final String AUSGABE_TXT = "ausgabe.txt";

	public static void main(String[] args) {
		UIDefaults uiDefaults = UIManager.getDefaults();
		Enumeration<Object> keys = uiDefaults.keys();
		String datei = AUSGABE_TXT;
		try (FileWriter fw = new FileWriter(datei)) {
			testMethode_1(args, keys, fw);
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private static void testMethode_1(String[] args, Enumeration<Object> keys, FileWriter fw) throws IOException {
		while (keys.hasMoreElements()) {
			String key = keys.nextElement().toString();
			if ((args.length == 0) || (key.indexOf(args[0]) >= 0)) {
				fw.write(key.toString() + "\n");
			}
		}
	}
}
