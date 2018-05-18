package app.controller;


import app.entity.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @ModelAttribute("user")
    public User user() {
        return new User();
    }


    @GetMapping("/")
    public String welcomePage(Model model){
        model.addAttribute("users", userService.findAll());

        return "index";
    }

    @PostMapping("/")
    public String saveUser(User user) {
        userService.save(user);
        return "redirect: /";
    }
}
