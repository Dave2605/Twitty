package util.spring;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

/**
 * Создает root context, который загружается applicationContextListener и child context (web context)
 */
public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { RootConfig.class };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] { WebConfig.class };
    }

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    /**
     * После того как AbstractAnnotationConfigDispatcherServletInitializer зарегистрировал DispatcherServlet
     * вызывается данный метод, тут можно указать доп конфиги
     */
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setMultipartConfig(
                new MultipartConfigElement("/home/dave/projects/Twitty/uploads/",
                        2097152, 4194304, 0));
    }

    /**
     * Вариант добавления фильтров
     */
//    protected Filter[] getServletFilters() {
//        return new Filter[] { new MyFilter() };
//    }
}
