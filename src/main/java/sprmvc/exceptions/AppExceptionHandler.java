package sprmvc.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(IOException.class)
    public String IOExceptionHandler(Model model){
        model.addAttribute("error","IOException");
        return "error";
    }

}
