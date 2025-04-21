package com.t_evolution_Systems.todo_list.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todos")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Todo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;
    private String descricao;
    private boolean realizado;
    private int prioridade;
}
