package com.example.todolist.kanban.Controllers;

import com.example.todolist.kanban.DTO.UsuarioDTO;
import com.example.todolist.kanban.Services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    UsuarioService uService;

    @PostMapping("/new")
    public ResponseEntity<UsuarioDTO> inserirUsuario(@RequestBody @Valid UsuarioDTO dto){
       dto = uService.inserirUsuario(dto);
       return  ResponseEntity.ok(dto);
    }





}
