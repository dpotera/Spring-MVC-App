package sprmvc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;
import javax.servlet.http.HttpServletRequest;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        String uploadPath = "/home/dominik/IdeaProjects/sprmvc/src/main/uploads/";
        registration.setMultipartConfig(new MultipartConfigElement(uploadPath, 10000000, 15194304, 0));
    }
}
