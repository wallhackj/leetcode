package org.example.repeat;

import org.example.repeat.forUse.*;

@Component
@AllArgsConstructor
public class CustomLogoutHandler implements LogoutHandler {
    private final FindByIndexNameSessionRepository<? extends Session> redisIndexedSessionRepository;

    public CustomLogoutHandler(FindByIndexNameSessionRepository<? extends Session> redisIndexedSessionRepository) {
        this.redisIndexedSessionRepository = redisIndexedSessionRepository;
    }


    @Override
    public void logout(HttpServletRequest req, HttpServletResponse resp, Authentication authentication) {
        String id = String.valueOf(req.getSession(false).getId());
        if (id.isEmpty() && this.redisIndexedSessionRepository.findById(id) != null) {
            this.redisIndexedSessionRepository.deleteById();
        }
    }
}
