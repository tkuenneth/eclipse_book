package com.thomaskuenneth.eclipse_book;

public class Summe {

	public static void main(String[] args) {
		int ergebnis = summe(args);
		System.out.println(ergebnis);
	}

	private static int summe(String[] args) {
		int wert = 0;
		for (int i = 0; i < args.length; i++) {
			int aktuell = Integer.parseInt(args[i]);
			wert += aktuell;
		}
		return wert;
	}
}
