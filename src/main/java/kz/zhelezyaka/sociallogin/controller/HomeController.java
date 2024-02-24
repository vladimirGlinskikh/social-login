package kz.zhelezyaka.sociallogin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "This home page!";
    }

    @GetMapping("/secured")
    public String secured() {
        return "This secured page!";
    }
}
