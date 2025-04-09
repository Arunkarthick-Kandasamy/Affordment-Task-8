package com.example.To_Do_list.service;

import com.example.To_Do_list.model.ToDoList;
import com.example.To_Do_list.repository.ListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ListService {
    @Autowired
    ListRepository listRepository;

    public String addText(ToDoList li) {
        listRepository.save(li);
        return "data added successfully ...!!!";
    }

    public List<ToDoList> getList() {
        return listRepository.findAll();
    }
}
