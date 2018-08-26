package com.thomaskuenneth.javafxzahlenraten;

import java.util.function.UnaryOperator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;

public class ZahlenratenController {
	
	private ZahlenratenService service;

	@FXML
	private TextField min;

	@FXML
	private TextField max;

	@FXML
	private TextField guess;

	@FXML
	private Label result;

	@FXML
	public void initialize() {
		service = new ZahlenratenService();
		UnaryOperator<TextFormatter.Change> filter = change -> {
			String text = change.getControlNewText();
			if (text.matches("-?[0-9]*")) {
				return change;
			}
			return null;
		};
		min.setTextFormatter(new TextFormatter<>(filter));
		max.setTextFormatter(new TextFormatter<>(filter));
		guess.setTextFormatter(new TextFormatter<>(filter));
	}

	@FXML
	protected void handleGuessButtonAction(ActionEvent event) {
		try {
			int _min = Integer.parseInt(min.getText());
			int _max = Integer.parseInt(max.getText());
			int _guess = Integer.parseInt(guess.getText());
			result.setText(service.rate(_min, _max, _guess));
		} catch (NumberFormatException e) {
			result.setText("falsches Format");
		}
	}
}
