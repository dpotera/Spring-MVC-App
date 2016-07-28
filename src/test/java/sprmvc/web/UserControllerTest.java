package sprmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import sprmvc.user.User;
import sprmvc.user.UserRepo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class UserControllerTest {


    @Test
    public void registerViewTest() throws Exception {
        UserController controller = new UserController();
        String expectedView = "registerForm";

        assertEquals(expectedView,controller.register());

        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/user/register")).andExpect(view().name(expectedView));

    }

    @Test
    public void registerFormTest() throws Exception {
        UserRepo mockRepo = mock(UserRepo.class);
        User unsaved = new User("dpotera","dominik","Dominik","Kowalski","mail@x.o");
        User saved = new User(24,"dpotera","dominik","Dominik","Kowalski","mail@x.o");

        when(mockRepo.save(unsaved)).thenReturn(saved);

        UserController controller = new UserController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(post("/user/register")
                .param("firstName","Dominik")
                .param("lastName","Kowalski")
                .param("userName","dpotera")
                .param("password","dominik")
                .param("email","mail@x.o"))
            .andExpect(redirectedUrl("/user/dpotera"));

        verify(mockRepo, atLeastOnce()).save(unsaved);

    }

}
