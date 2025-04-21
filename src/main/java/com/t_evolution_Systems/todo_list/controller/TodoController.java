package com.t_evolution_Systems.todo_list.controller;

import com.t_evolution_Systems.todo_list.entity.Todo;
import com.t_evolution_Systems.todo_list.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class TodoController {
    private TodoService todoService;

    @PostMapping
   public List<Todo> create(@RequestBody Todo todo){
        return todoService.create(todo);
   }

   @GetMapping
    public List<Todo> list(){
        return todoService.list();
    }

    @PutMapping
    public List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    public List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }
}
