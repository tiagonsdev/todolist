package com.t_evolution_Systems.todo_list.repository;
import com.t_evolution_Systems.todo_list.entity.Todo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>{
}
