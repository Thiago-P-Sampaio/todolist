package com.example.todolist.kanban.Services;

import com.example.todolist.kanban.DTO.TarefasDTO;
import com.example.todolist.kanban.Entities.Status;
import com.example.todolist.kanban.Entities.Tarefas;
import com.example.todolist.kanban.Entities.Usuarios;
import com.example.todolist.kanban.Repositories.TarefasRepositorio;
import com.example.todolist.kanban.Repositories.UsuarioRepositorio;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDate;
import java.util.List;

@Service
public class TarefasService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    TarefasRepositorio tarefasRepositorio;

    @Transactional
    public TarefasDTO novaTarefa( TarefasDTO dto){
        Tarefas tarefa = new Tarefas();
        tarefa.setDescricao(dto.getDescricao());
        tarefa.setData_cadastro(LocalDate.now());
        tarefa.setSetor(dto.getSetor());
        Usuarios usuario = usuarioRepositorio.getReferenceById(dto.getId_usuario());
        tarefa.setUsuario(usuario);
        tarefa.setStatus(Status.A_FAZER);
        tarefa.setPrioridade(dto.getPrioridade());
        tarefa = tarefasRepositorio.save(tarefa);

        return  new TarefasDTO(tarefa);
    }


    public List<TarefasDTO> listarTarefas(){
        List<Tarefas> tarefas = tarefasRepositorio.findAll();

        return tarefas.stream().map(x -> new TarefasDTO(x)).toList();
    }

}
