package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sprmvc.upload.Upload;
import sprmvc.user.User;
import sprmvc.user.UserRepo;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @Autowired
    HttpServletRequest request;

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
    public String completeRegistration(@Valid User user, Errors errors) throws IOException {
        if(errors.hasErrors())
            return "registerForm";
        MultipartFile multipartFile = user.getFile();

        String fileName = multipartFile.getOriginalFilename();

        File checkFile = new File(Upload.ROOT+fileName);
        if (checkFile.exists())
            if(checkFile.delete())
                System.out.print("Deleted file: "+checkFile.getPath());

        Files.copy(multipartFile.getInputStream(), Paths.get(Upload.ROOT,fileName));

        user.setProfilePicturePath("/uploads/"+fileName);
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
