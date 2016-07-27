package sprmvc.web;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {

    @Test
    public void homeTest() {
        HomeController controller = new HomeController();
        assertEquals("home", controller.home());
    }

}