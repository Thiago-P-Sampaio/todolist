package com.example.todolist.kanban.Services;

import com.example.todolist.kanban.DTO.TarefasDTO;
import com.example.todolist.kanban.Entities.Tarefas;
import com.example.todolist.kanban.Entities.Usuarios;
import com.example.todolist.kanban.Repositories.TarefasRepositorio;
import com.example.todolist.kanban.Repositories.UsuarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;

@Service
public class TarefasService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    TarefasRepositorio tarefasRepositorio;

    public TarefasDTO novaTarefa(@RequestBody TarefasDTO dto){
        Tarefas tarefa = new Tarefas();
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setData_cadastro(LocalDate.now());
        tarefa.setSetor(dto.getSetor());
        Usuarios usario = usuarioRepositorio.getReferenceById(dto.getId_usuario());
        tarefa.setUsuario(usario);
        tarefa = tarefasRepositorio.save(tarefa);

        return  new TarefasDTO(tarefa);

    }

}
