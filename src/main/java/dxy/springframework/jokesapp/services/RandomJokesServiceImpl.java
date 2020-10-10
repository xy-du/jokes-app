package dxy.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author AD
 * @date 2020/10/09
 */
@Service
public class RandomJokesServiceImpl implements RandomJokesService {

    private final ChuckNorrisQuotes quotes;

    public RandomJokesServiceImpl() {
        this.quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJokes() {
        return quotes.getRandomQuote();
    }
}
