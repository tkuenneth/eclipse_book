package com.thomaskuenneth.javafxzahlenraten;

import java.io.IOException;
import java.net.URI;
import org.json.JSONObject;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class ZahlenratenService {

	private final HttpClient client;

	public ZahlenratenService() {
		client = HttpClient.newHttpClient();
	}

	public String rate(int min, int max, int guess) {
		String result = null;
		String url = "http://localhost:8080/guess?min=%d&max=%d&guess=%d";
		url = String.format(url, min, max, guess);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url)).build();
		try {
			HttpResponse<String> response = client.send(request, 
					BodyHandler.asString());
			if (response.statusCode() == 200) {
				JSONObject jo = new JSONObject(response.body());
				boolean correct = jo.getBoolean("correct");
				result = correct ? "Richtig" : "Falsch";
			}
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
}
