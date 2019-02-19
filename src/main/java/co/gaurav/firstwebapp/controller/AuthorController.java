package co.gaurav.firstwebapp.controller;

import co.gaurav.firstwebapp.repository.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

/**
 * Created with IntelliJ IDEA.
 * User: sharm
 * Date: 14/02/19
 * Time: 22:49
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository){
        this.authorRepository =authorRepository;
    }

    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
