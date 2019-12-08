package net.enver.springsecurityapp.service;

import net.enver.springsecurityapp.model.User;

/**
 * Service class for {@link net.enver.springsecurityapp.model.User}
 *
 * @author Enver on 08.12.2019 1:51.
 * @version 1.0
 * @project SpringSecurityApp
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
