package com.techeeresc.tab.domain.shareinfo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/")
public class ShareInfoController {
    @GetMapping
    public String hello() {
        return "success";
    }
}