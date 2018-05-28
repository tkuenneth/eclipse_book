package com.thomaskuenneth.eclipse_book;

public class Schaltjahr {
	public static void main(String[] args) {
		int jahr = Integer.parseInt(args[0]);
		boolean schaltjahr = schaltjahrPruefen(jahr);
		System.out.println(jahr + " ist " + (schaltjahr ? "" : "k") + "ein Schaltjahr");
	}

	public static boolean schaltjahrPruefen(int jahr) {
		boolean schaltjahr = false;
		if ((jahr % 4) == 0) {
			schaltjahr = true;
			if ((jahr % 400) != 0) {
				if ((jahr % 100) == 0) {
					// schaltjahr = false;
				}
			}
		}
		return schaltjahr;
	}
}
