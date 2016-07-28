package sprmvc.post;


import java.util.List;

public interface PostRepo {
    public static final String POST_NOT_FOUND = "Sorry :( Post that You are looking for don't exists.";

    List<Post> findPosts(int max, int number);

    Post getPost(long id) throws IllegalArgumentException;

}
