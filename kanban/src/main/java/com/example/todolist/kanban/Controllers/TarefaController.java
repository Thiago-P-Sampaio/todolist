package com.example.todolist.kanban.Controllers;


import com.example.todolist.kanban.DTO.TarefasDTO;
import com.example.todolist.kanban.Services.TarefasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TarefaController {

    @Autowired
    TarefasService Tservice;

    @PostMapping("/new")
    public ResponseEntity<TarefasDTO> inserirTarefa(@RequestBody @Valid TarefasDTO dto){
    dto = Tservice.novaTarefa(dto);
    return ResponseEntity.ok(dto);
    }

    @GetMapping("/all")
    public List<TarefasDTO> listarTarefas(){
       return Tservice.listarTarefas();
    }
}
