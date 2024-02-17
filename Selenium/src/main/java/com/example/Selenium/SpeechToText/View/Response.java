package com.example.Selenium.SpeechToText.View;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/web")
public class Response {

    @GetMapping("/SpeechToText")
    private ResponseEntity<?> SpeechToText()  {
        return ResponseEntity.ok(new String(""));
    }
}
