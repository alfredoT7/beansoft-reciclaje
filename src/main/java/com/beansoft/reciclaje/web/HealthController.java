package com.beansoft.reciclaje.web;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthController {

    @GetMapping
    public Map<String, String> root() {
        return Map.of("status", "ok", "app", "reciclaje");
    }
}
