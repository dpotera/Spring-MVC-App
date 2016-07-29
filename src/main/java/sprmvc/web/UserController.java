package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sprmvc.user.User;
import sprmvc.user.UserRepo;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    public UserController() {}

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model){
        model.addAttribute(new User());
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String completeRegistration(@Valid User user, Errors errors){
        if(errors.hasErrors())
            return "registerForm";
        userRepo.save(user);
        return "redirect:/user/"+user.getUserName();
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    public String showUserProfile(@PathVariable("userName") String userName, Model model){
        try{
            User user = userRepo.getByUserName(userName);
            model.addAttribute("user",user);
            return "userProfile";
        } catch (IllegalArgumentException e){
            model.addAttribute("error","User \""+userName+"\" not found.");
            return "error";
        }
    }

}
