/**
 * 
 */
package guru.springframework.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.services.JokeService;

/**
 * Created by @author IzaakVanNiekerk
 *
 */
@Controller
public class JokeController {

	private JokeService jokeService;

	/**
	 * Was not necessary for the @Autowired annotation, Spring would have auto-wired it for us. <br>
	 * But we do this to show intent and for best practices. <br>
	 * 
	 * @param jokeService
	 */
	@Autowired
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
	}

	/**
	 * Map the context root to the showJoke method. <br>
	 * 
	 * @return
	 */
	@RequestMapping({ "/", "" })
	public String showJoke(Model model) {

		model.addAttribute("joke", jokeService.getJoke());

		return "chucknorris"; // return the view name

	}

}
