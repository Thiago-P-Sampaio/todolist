package com.example.todolist.kanban.Services;

import com.example.todolist.kanban.DTO.UsuarioDTO;
import com.example.todolist.kanban.Entities.Usuarios;
import com.example.todolist.kanban.Repositories.UsuarioRepositorio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public UsuarioDTO inserirUsuario(@RequestBody @Valid UsuarioDTO dto){
        Usuarios usuarioNovo = new Usuarios();
        usuarioNovo.setNome(dto.getNome());
        usuarioNovo.setEmail(dto.getEmail());
        usuarioNovo = usuarioRepositorio.save(usuarioNovo);

        return  new UsuarioDTO(usuarioNovo);
    }


}
