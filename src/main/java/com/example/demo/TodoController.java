package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.LoginService;

import com.example.demo.TodoService;

@Controller

@SessionAttributes("name")

public class TodoController {

    @Autowired

    TodoService service;

    @RequestMapping(value="/list-todos", method = RequestMethod.GET)

    public String showTodos(ModelMap model){

        String name = (String) model.get("name");
        System.out.println("name "+name);
        model.put("todos", service.retrieveTodos(name));
        
        //model.put("todos", service.retrieveTodos("in28Minutes"));

        return "list-todos";

    }

}