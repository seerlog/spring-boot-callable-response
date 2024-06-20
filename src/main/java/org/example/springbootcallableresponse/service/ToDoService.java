package org.example.springbootcallableresponse.service;

import lombok.RequiredArgsConstructor;
import org.example.springbootcallableresponse.domain.todo.ToDoRepository;
import org.example.springbootcallableresponse.request.ToDoRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ToDoService {
    private final ToDoRepository toDoRepository;

    public void select(Long id) {
        System.out.println("select");
    }

    public void insert(ToDoRequest toDoRequest) {
        System.out.println("insert");
    }

    public void update(ToDoRequest toDoRequest) {
        System.out.println("update");
    }

    public void delete(Long id) {
        System.out.println("delete");
    }
}
