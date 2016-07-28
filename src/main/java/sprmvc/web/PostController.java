package sprmvc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sprmvc.Post;
import sprmvc.PostRepo;

import java.util.List;

@Controller
@RequestMapping(value = "/posts")
public class PostController {
    private static final String MAX_INT_AS_STRING = "2147483647";

    private PostRepo postRepo;

    @Autowired
    public PostController(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Post> posts(
            @RequestParam(value = "max", defaultValue = MAX_INT_AS_STRING) int max,
            @RequestParam(value = "number", defaultValue = "20") int number) {
        return postRepo.findPosts(max, number);
    }

}
