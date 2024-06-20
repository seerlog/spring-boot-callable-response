package org.example.springbootcallableresponse.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootcallableresponse.request.ToDoRequest;
import org.example.springbootcallableresponse.service.ToDoService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sync")
@RequiredArgsConstructor
public class AsyncController {
    private final ToDoService toDoService;

    @GetMapping("/todo/{id}")
    public String select(@PathVariable Long id) {
        toDoService.select(id);
        return "select";
    }

    @PostMapping("/todo")
    public String insert(@RequestBody ToDoRequest toDoRequest) {
        toDoService.insert(null);
        return "insert";
    }

    @PutMapping("/todo")
    public String update(@RequestBody ToDoRequest toDoRequest) {
        toDoService.update(null);
        return "update";
    }

    @DeleteMapping("/todo/{id}")
    public String delete(@PathVariable Long id) {
        toDoService.delete(id);
        return "delete";
    }
}
