/**
 * 
 */
package guru.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * JokeServiceImpl <br>
 * A Java Tip: Create a final private variable and instantiate it in the constructor! :) <br>
 * <br>
 * Created by @author IzaakVanNiekerk on @since 2017/12/28
 */
@Service
public class JokeServiceImpl implements JokeService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;

	public JokeServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
