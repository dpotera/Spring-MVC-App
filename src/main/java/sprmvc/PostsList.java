package sprmvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PostsList implements PostRepo {

    private List<Post> postList;

    public PostsList() throws IOException {
        FileReader file = new FileReader("src/main/resources/posts.json");
        ObjectMapper mapper = new ObjectMapper();
        Post[] posts = mapper.readValue(file, Post[].class);
        postList = new ArrayList<>();
        postList.addAll(Arrays.asList(posts));
    }

    @Override
    public List<Post> findPosts(int max, int number) {
        List<Post> result = new ArrayList<>();
        int size = postList.size();
        int maxVal = (size < max ? size : max);
        int border = maxVal - number;
        border = border >= 0 ? border : 0;
        for (int i = maxVal; i > border; i--)
            result.add(postList.get(i - 1));
        return result;
    }

    @Override
    public Post getPost(long id) throws IllegalArgumentException {
        if (id >= postList.size() || id < 0)
            throw new IllegalArgumentException();
        return postList.get((int) id);
    }
}
