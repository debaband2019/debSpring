package com.example.demo;

import java.util.ArrayList;

import java.util.Date;

import java.util.Iterator;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Todo;

@Service

public class TodoService {

    private static List<Todo> todos = new ArrayList<Todo>();

    private static int todoCount = 3;

    static {

        todos.add(new Todo(1, "in28Minutes", "\"SpringMVC\"", new Date(),false));

        todos.add(new Todo(2, "in28Minutes", "\"Struts\"", new Date(), false));

        todos.add(new Todo(3, "in28Minutes", "\"Hibernate\"", new Date(),false));

    }

    public List<String> retrieveTodos(String user) {

       // List<Todo> filteredTodos = new ArrayList<Todo>();
        List<String> filteredTodos = new ArrayList<String>();
        System.out.println("user is "+user);
        for (Todo todo : todos) {

            if (todo.getUser().equals(user)) {

                filteredTodos.add(todo.getDesc());

            }

        }

        return filteredTodos;

    }

}


