package com.thomaskuenneth.eclipse_book;

public class Fakultaet {

	public static int fakultaet(int zahl) {
		int ergebnis = 1;
		if (zahl > 1) {
			ergebnis = zahl * fakultaet(zahl - 1);
		}
		return ergebnis;
	}

	public static void main(String[] args) {
		if (args.length < 1) {
			System.exit(1);
		}
		int zahl = Integer.parseInt(args[0]);
		int ergebnis = fakultaet(zahl);
		System.out.print(zahl + "! = " + ergebnis);
	}
}