package web.controller;

import core.data.AuthorRepository;
import core.exceptions.DataNotFoundException;
import core.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/author")
public class AuthorController {

    //@Autowired
    AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Author());
        return "registrationForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Author author, Errors errors, Model model
                                  // для того чтобы засунуть объект в сессию и затем достать
                                      // при redirect   RedirectAttributes model
                                      ) throws IOException {
        if (errors.hasErrors()) {
            return "registrationForm";
        }
       // authorRepository.save(author);

        MultipartFile profilePicture = author.getProfilePicture();
        if (!profilePicture.isEmpty()) {
            profilePicture.transferTo(new File("/home/dave/projects/Twitty/uploads/" + author.getUserName() + ".jpg"));
        }
        model.addAttribute("userName", author.getUserName());
        // model.addFlashAttribute("author", author);
        return "redirect:/author/{userName}";
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showAuthorProfile(@PathVariable String username, Model model) throws DataNotFoundException {
        Author author = authorRepository.findByUsername(username);
        model.addAttribute(author);
        return "profile";
    }
}
