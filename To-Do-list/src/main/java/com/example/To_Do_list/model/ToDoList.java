package com.example.To_Do_list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;

import static jakarta.persistence.GenerationType.AUTO;

@Data
@AllArgsConstructor
@Entity
public class ToDoList {
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    private String task;
    private String status;

    public ToDoList(String task, String status) {
        this.task = task;
        this.status = status;
    }
}
