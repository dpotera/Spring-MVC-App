package sprmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostsList implements PostRepo {

    private List<Post> postList;

    public PostsList() throws IOException {
        FileReader file = new FileReader("src/main/resources/posts.json");
        ObjectMapper mapper = new ObjectMapper();
        Post[] posts = mapper.readValue(file,Post[].class);
        postList = new ArrayList<>();
        for(Post p : posts)
            postList.add(p);
    }

    @Override
    public List<Post> findPosts(long max, int number) {
        List<Post> result = new ArrayList<>();
        for(int i=0; i<max && i<postList.size(); i++)
            result.add(postList.get(i));
        return result;
    }
}
