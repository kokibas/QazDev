package com.SpringQazDev.SpringWebApp.controllers;

import com.SpringQazDev.SpringWebApp.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import java.io.*;

@Controller
@RequestMapping("/Text")
public class InputController {
    @Autowired
    private SaveService saveService;

    @GetMapping("/input")
    public String getInputView() {
        return "Text/input";
    }

    @PostMapping("/save")
    public String saveInputToFile(@RequestParam("text") String text) {
        saveService.save(text);
        return "redirect:/Text/input";
    }
}
