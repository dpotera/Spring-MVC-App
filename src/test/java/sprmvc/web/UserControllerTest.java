package sprmvc.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.assertEquals;
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

}
