package com.spydrone.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeService implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public ChuckNorrisJokeService() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
