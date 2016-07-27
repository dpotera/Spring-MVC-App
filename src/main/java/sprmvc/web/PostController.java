package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sprmvc.PostRepo;

@RequestMapping(value = "/posts")
public class PostController {

    private PostRepo postRepo;

    @Autowired
    public PostController(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String posts(Model model) {
        model.addAttribute("postsList", postRepo.findPosts(Long.MAX_VALUE, 20));
        return "posts";
    }

}
