package com.acs.spring.react.presenation;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.acs.spring.react.model.Model;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller which serves as an entry-point for requests for jibber nonsense verse.
 *
 */
@RestController
@RequestMapping("/api")
public class MainController {

    private static ObjectMapper mapper = new ObjectMapper();

    @GetMapping
    public ResponseEntity list() throws IOException {

        List<Model> list = new ArrayList<>();
        list.add(Model.builder().id("1234").name("Name 1").build());
        list.add(Model.builder().id("1235").name("Name 2").build());
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Total-Count", String.valueOf(list.size()));
        return ResponseEntity.ok().headers(headers).body(list);
    }
}
