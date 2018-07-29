/**
 * 
 */
package com.thomaskuenneth.systempropertyviewer;


/**
 * @author tkuen
 *
 */
public class Test {
	public static Test createTest(int modus) {
		return new Test(modus);
	}

	private int modus;
	
	private String meldung = Messages.getString("Test.0"); //$NON-NLS-1$

	private Test(int modus) {
		this.modus = modus;
	}

	public int getModus() {
		return modus;
	}

	public void setModus(int modus) {
		this.modus = modus;
	}
	
	// FIXME Test
}