package sprmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import sprmvc.Post;
import sprmvc.PostRepo;
import sprmvc.web.PostController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class PostControllerTest {

    @Test
    public void shoudShowRecentPosts() throws Exception {
        List<Post> postList = cretePostsList(20);
        PostRepo postRepo = mock(PostRepo.class);
        when(postRepo.findPosts(Integer.MAX_VALUE,20)).thenReturn(postList);

        PostController controller = new PostController(postRepo);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(
                new InternalResourceView("/WEB-INF/views/posts.jsp")
        ).build();

        mockMvc.perform(get("/posts"))
            .andExpect(view().name("posts"))
            .andExpect(model().attributeExists("postList"))
            .andExpect(model().attribute("postList",hasItems(postList.toArray())));
    }

    public List<Post> cretePostsList(int number){
        List<Post> postList = new ArrayList<>();
        for(int i=1; i<=number; i++)
            postList.add(new Post("Post "+i,new Date()));
        return postList;
    }

}
