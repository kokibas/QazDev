package com.SpringQazDev.SpringWebApp.controllers;

import com.SpringQazDev.SpringWebApp.Entity.Documents;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/Text")
public class SearchSymbol {
    @GetMapping("/searchForm")
    public String showSearchForm() {
        return "search_form";
    }

    @PostMapping("/search")
    public String searchDocuments(@RequestParam("searchText") String searchText, Model model) {
        List<Documents> foundDocuments = Documents.searchByContent(searchText);
        model.addAttribute("documents", foundDocuments);
        return "search";
    }
}
