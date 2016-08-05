package sprmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping(value = {"/", "/home"})
public class HomeController {

    @RequestMapping(method = GET)
    public String home() throws IOException {
        return "home";
    }

}
