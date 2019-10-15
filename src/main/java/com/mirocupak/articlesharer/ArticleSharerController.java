package com.mirocupak.articlesharer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ArticleSharerController {

    @GetMapping("/")
    String hello() {
        return "Hello test!";
    }
}
