package org.example.repeat;

import org.example.repeat.forUse.*;

import javax.naming.AuthenticationException;


@Component
@AllArgsConstructor
public class AuthEntryPoint implements AuthenticationEntryPoint {
    private final HandlerExceptionResolver handlerExceptionResolver;

    public AuthEntryPoint(HandlerExceptionResolver handlerExceptionResolver) {
        this.handlerExceptionResolver = handlerExceptionResolver;
    }

    @Override
    public void commence(HttpServletRequest req,
                         HttpServletResponse resp,
                         AuthenticationException authException) {
        this.handlerExceptionResolver.resolveException(req, resp, null, authException);
    }
}
