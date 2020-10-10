package dxy.springframework.jokesapp.controllers;

import dxy.springframework.jokesapp.services.RandomJokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author AD
 * @date 2020/10/09
 */
@Controller
public class JokesController {
    private RandomJokesService randomJokesService;

    public JokesController(RandomJokesService randomJokesService) {
        this.randomJokesService = randomJokesService;
    }

    @RequestMapping("/")
    public String getJokes(Model model){
        model.addAttribute("jokes", randomJokesService.getRandomJokes());
        return "chucknorris";
    }
}
