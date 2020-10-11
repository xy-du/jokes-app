package dxy.springframework.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author AD
 * @date 2020/10/11
 */
public class ChuckConfiguration {
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
