package com.example.todolist.kanban.Repositories;

import com.example.todolist.kanban.Entities.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TarefasRepositorio extends JpaRepository<Tarefas, Long> {
}
