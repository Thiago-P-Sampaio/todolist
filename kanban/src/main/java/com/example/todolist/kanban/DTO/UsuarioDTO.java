package com.example.todolist.kanban.DTO;

import com.example.todolist.kanban.Entities.Usuarios;

public class UsuarioDTO {

    private Long id;
    private String nome;
    private String email;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDTO(Usuarios usuario){
        this.id = usuario.getId();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
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
}
