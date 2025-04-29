package com.example.todolist.kanban.Entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "tb_usuarios")
public class Usuarios {

    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<Tarefas> tarefa = new ArrayList<>();

    public Usuarios() {
    }

    public Usuarios(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tarefas> getTarefa() {
        return tarefa;
    }

    public void setTarefa(List<Tarefas> tarefa) {
        this.tarefa = tarefa;
    }
}
