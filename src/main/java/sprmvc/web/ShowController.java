package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sprmvc.PostRepo;

@Controller
@RequestMapping("/show")
public class ShowController {

    @Autowired
    PostRepo postRepo;

    @RequestMapping(value = "/{postID}", method = RequestMethod.GET)
    public String show(@PathVariable("postID") long id, Model model) {
        try {
            model.addAttribute("post", postRepo.getPost(id));
            return "show";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", PostRepo.POST_NOT_FOUND);
            return "error";
        }
    }

}
