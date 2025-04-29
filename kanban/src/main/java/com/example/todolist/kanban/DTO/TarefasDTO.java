package com.example.todolist.kanban.DTO;

import com.example.todolist.kanban.Entities.Prioridade;
import com.example.todolist.kanban.Entities.Status;
import com.example.todolist.kanban.Entities.Tarefas;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public class TarefasDTO {

    private Long id;
    private Long id_usuario;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDate data_cadastro;
    private Status status;

    public TarefasDTO() {
    }

    public TarefasDTO(Long id, Long id_usuario, String descricao, String setor, Prioridade prioridade, LocalDate data_cadastro, Status status) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.descricao = descricao;
        this.setor = setor;
        this.prioridade = prioridade;
        this.data_cadastro = data_cadastro;
        this.status = status;
    }
    //Referenciando a minha entidade "Tarefa"
    public TarefasDTO(Tarefas tarefa){
        this.id = tarefa.getId();
        this.id_usuario = tarefa.getUsuario().getId();
        this.descricao = tarefa.getDescricao();
        this.setor = tarefa.getSetor();
        this.prioridade = tarefa.getPrioridade();
        this.data_cadastro = tarefa.getData_cadastro();
        this.status = tarefa.getStatus();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(LocalDate data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
