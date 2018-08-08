package com.thomaskuenneth.mavendemo;

import java.io.IOException;
import com.github.lalyos.jfiglet.FigletFont;

public class App {
	public static void main(String[] args) {
		String asciiArt = "";
		try {
			asciiArt = FigletFont.convertOneLine("Hallo Eclipse");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(asciiArt);
	}
}
