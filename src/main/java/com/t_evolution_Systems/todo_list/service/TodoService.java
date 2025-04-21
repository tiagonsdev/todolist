package com.t_evolution_Systems.todo_list.service;

import com.t_evolution_Systems.todo_list.entity.Todo;
import com.t_evolution_Systems.todo_list.repository.TodoRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository todoRepository;

    //Parte onde ocorre as cofigurações do crud e as regras de negócio

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        //definindo como a lista vai ser ordenada:

        Sort sort = Sort.by("prioridade").descending().and(
                Sort.by("nome").ascending()
        );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return list();
    }
}
