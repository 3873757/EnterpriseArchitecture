package edu.mum.extra.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import edu.mum.extra.domain.Movie;
import edu.mum.extra.service.MovieService;

@Controller
@RequestMapping("/addMovie")
public class MovieController {

	@Autowired
	MovieService movieservice;

	@RequestMapping("/")
	public String addnewmovies(Movie movie, Model model) {		
		model.addAttribute("movies", movie);
		return "movie";
	}

	@RequestMapping("/movie")
	public String processadd(@Valid @ModelAttribute("movieAdd") Movie movie, BindingResult bindingResult, Model model,
			RedirectAttributes redirectAttributes) {
		if (bindingResult.hasErrors()) {
			return "addMovie";
		}
		String[] addvalue = bindingResult.getSuppressedFields();
		if (addvalue.length > 0) {
			throw new RuntimeException("Attempt to bind fields that haven't been allowed in initBinder(): "
					+ StringUtils.addStringToArray(addvalue, ", "));
		}
		{
			movieservice.save(movie);
			redirectAttributes.addFlashAttribute("movies", movie);
			return "redirect:/movieList";
		}
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getallmovies(@PathVariable("genre") Movie movie, Model model) {
		movieservice.findAll();
		return "movieList";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String getallmoviesByGener(@PathVariable("genre") Movie movie, Model model) {
		 movieservice.findAll();
		movieservice.getByGenre(movie.getGenre());
		return "movieList";
	}

//	@RequestMapping(value = "/movieDetails", method = RequestMethod.POST)
//	public String getallmoviesByTitle(@PathVariable("title") Movie movie, Model model) {
//		movieservice.getByTitle(movie.getTitle());
//		return "movieList";
//	}

//	@RequestMapping(value = "/movieDetails", method = RequestMethod.POST)
//	public String getallmoviesByYera(@PathVariable("year") Movie movie, Model model) {
//		movieservice.getByYear(movie.getYear());
//		return "movieList";
//	}

//	@RequestMapping(value = "/movieDetails", method = RequestMethod.POST)
//	public String getallmoviesByRating(@PathVariable("rating") Movie movie, Model model) {
//		movieservice.getByrating(movie.getRating());
//		return "movieList";
//	}

}
