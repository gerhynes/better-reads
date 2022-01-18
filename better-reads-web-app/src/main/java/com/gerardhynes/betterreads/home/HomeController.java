package com.gerardhynes.betterreads.home;

import com.gerardhynes.betterreads.user.BooksByUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    @Autowired
    BooksByUserRepository booksByUserRepository;

    public String home(@AuthenticationPrincipal OAuth2User principal){
        if (principal == null || principal.getAttribute("login") == null){
            return "index";
        }
        String userId = principal.getAttribute("login");

        return "home";
    }
}
