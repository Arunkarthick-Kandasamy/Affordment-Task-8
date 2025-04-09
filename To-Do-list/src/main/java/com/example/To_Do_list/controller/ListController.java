package com.example.To_Do_list.controller;

import com.example.To_Do_list.model.ToDoList;
import com.example.To_Do_list.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {
    @Autowired
    ListService listService;

    @PostMapping("/add")
    public String addText(@RequestBody ToDoList li){
        return listService.addText(li);
    }
    @GetMapping("/")
    public List<ToDoList> getList(){
        return listService.getList();
    }

}
