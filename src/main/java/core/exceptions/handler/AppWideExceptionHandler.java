package core.exceptions.handler;

import core.exceptions.DataNotFoundException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by dave on 14.05.17.
 */
@ControllerAdvice
public class AppWideExceptionHandler {
    @ExceptionHandler(DataNotFoundException.class)
    public String dataNotFoundHandler() {
        return "notFound";
    }

    @ExceptionHandler(AccessDeniedException.class)
    public String accessDeniedException() {
        return "denied";
    }
}
