package com.myProjects.IDontForgetIt.controllers;

import com.myProjects.IDontForgetIt.domain.Record;
import com.myProjects.IDontForgetIt.repos.RecordRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private RecordRepo recordRepo;
    @GetMapping("/")
    public String index(Map<String, Object> model){
        Iterable<Record> records = recordRepo.findAll();
        model.put("records", records);
        return "index";
    }
    @PostMapping
    public String add(@RequestParam String tittle, @RequestParam String text, Map<String, Object> model){
        Record record = new Record(tittle,text);
        recordRepo.save(record);
        Iterable<Record> records = recordRepo.findAll();
        model.put("records", records);
        return "index";
    }
}
