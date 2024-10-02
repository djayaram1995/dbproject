package com.devbydj.dbproject.controller;

import com.devbydj.dbproject.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @Autowired
    DbService dbService;

    @GetMapping("hi")
    public ResponseEntity<String> getResponse() {
        dbService.deleteAuthPermission();
        return ResponseEntity.ok("Response");
    }
}
