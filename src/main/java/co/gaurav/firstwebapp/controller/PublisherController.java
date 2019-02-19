package co.gaurav.firstwebapp.controller;

import co.gaurav.firstwebapp.repository.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: sharm
 * Date: 18/02/19
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class PublisherController {

    PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository){
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping("/pubisher")
    public String getPublisher(Model model){
        model.addAttribute("publishers", publisherRepository.findAll());
        return "publishers";
    }

}
