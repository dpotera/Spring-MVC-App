package sprmvc.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class homeRequestAspect {

    @Before("execution(** sprmvc.web.HomeController.home(..))")
    public void homeRequestNotifier(){
        System.out.println("Aspect see that HomeController.home() is executed.");
    }

}
