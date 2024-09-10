package org.example.repeat;

import org.example.repeat.forUse.*;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView handlerNotFound(NoHandlerFoundException ex) {
        if (ex.getRequestURL().endsWith("/favicon.ico")) {
            return new ModelAndView("forward:/Static/favicon.ico");
        }
        log.error(ex.getMessage(), ex);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("not_found");
        return modelAndView;
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ModelAndView handlerInternalServerError(Exception ex) {
        log.error(ex.getMessage(), ex);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("server_error");
        return modelAndView;
    }
}
