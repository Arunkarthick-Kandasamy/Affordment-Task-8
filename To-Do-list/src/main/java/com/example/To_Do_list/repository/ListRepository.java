package com.example.To_Do_list.repository;

import com.example.To_Do_list.model.ToDoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListRepository extends JpaRepository<ToDoList , Integer> {
}
