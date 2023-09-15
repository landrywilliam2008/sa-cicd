package com.admsport.test;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sa")
public class SaController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Object> search() {
        return List.of(new SaRecord(1, "Belle formation", 1));
    }
}
