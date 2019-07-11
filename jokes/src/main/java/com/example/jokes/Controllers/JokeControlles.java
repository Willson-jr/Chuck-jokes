package com.example.jokes.Controllers;

import com.example.jokes.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeControlles {
    /*
    po adresie url: localhoust:8080/ do metody generateJoke();

    ModelMap sluzy do przekazywania danych z Kontrolera do widoku HTML
    jesli piszemy map.put("name","Michał"),
            to w HTML bedzie widoczna zmienna name, z wartoscia Michał
     */
    @GetMapping("/")
    public String generateJoke(ModelMap map){
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        map.put("joke",chuckNorrisQuotes.getRandomQuote());
        return "joke";  // przejdz do pliku
                        // resources/templates/joke.html
    }



}
