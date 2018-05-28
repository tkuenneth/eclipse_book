package com.thomaskuenneth.eclipse_book;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SchaltjahrTest {

	@Test
	@DisplayName("Hallo Eclipse")
	public void testSchaltjahrPruefen() {
		int jahr;
		boolean ergebnis;
		// auf "ist kein Schaltjahr" prüfen
		jahr = 1903;
		ergebnis = Schaltjahr.schaltjahrPruefen(jahr);
		assertFalse(jahr + " ist kein Schaltjahr", ergebnis);
		// auf "ist ein Schaltjahr" prüfen
		jahr = 1904;
		ergebnis = Schaltjahr.schaltjahrPruefen(jahr);
		assertTrue(jahr + " ist ein Schaltjahr", ergebnis);
		
		assertFalse(Schaltjahr.schaltjahrPruefen(1900));
		assertTrue(Schaltjahr.schaltjahrPruefen(2000));
	}
}
