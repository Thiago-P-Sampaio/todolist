package com.example.todolist.kanban.Repositories;

import com.example.todolist.kanban.Entities.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuarios, Long> {
}
