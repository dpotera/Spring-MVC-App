package sprmvc;

import java.util.List;

public interface PostRepo {
    List<Post> findPosts(long max, int number);
}
