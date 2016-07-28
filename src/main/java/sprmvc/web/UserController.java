package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sprmvc.user.User;
import sprmvc.user.UserRepo;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String completeRegistration(User user){
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
