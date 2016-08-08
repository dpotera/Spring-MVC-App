package sprmvc.exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.io.IOException;

@ControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(IOException.class)
    public String IOExceptionHandler(Model model, Exception ex){
        model.addAttribute("error","IOException");
        model.addAttribute("msg",ex.toString());
        ex.printStackTrace();
        return "error";
    }

}
