package com.thomaskuenneth.eclipse_book;

import java.io.Console;

public class Quadrat {
	public static void main(String[] args) {
		Console c = System.console();
		if (c != null) {
			while (true) {
				c.printf("Bitte geben Sie eine Zahl ein. q beendet das Programm: ");
				String eingabe = c.readLine();
				if (eingabe.equalsIgnoreCase("q")) {
					break;
				}
				int zahl = Integer.parseInt(eingabe);
				c.printf("Das Quadrat von %d ist %d\n", zahl, zahl * zahl);
			}
		}
	}
}
