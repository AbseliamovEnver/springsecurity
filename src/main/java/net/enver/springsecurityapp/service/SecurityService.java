package net.enver.springsecurityapp.service;

/**
 * Service for Security
 *
 * @author Enver on 08.12.2019 2:13.
 * @version 1.0
 * @project SpringSecurityApp
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
