package com.tuten.backendtest.controllers;

import com.tuten.backendtest.models.Timezone;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timezone")
public class TimezoneController {
    @PostMapping()
    public Timezone getTimezone(@RequestParam String time, @RequestParam String offset) {
        return new Timezone(time, offset);
    }
}
