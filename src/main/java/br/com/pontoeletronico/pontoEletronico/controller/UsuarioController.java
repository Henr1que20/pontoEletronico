package br.com.pontoeletronico.pontoEletronico.controller;

import br.com.pontoeletronico.pontoEletronico.DTO.UsuarioDto;
import br.com.pontoeletronico.pontoEletronico.DTO.UsuarioRespotaDto;
import br.com.pontoeletronico.pontoEletronico.model.Usuario;
import br.com.pontoeletronico.pontoEletronico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/usuarios")
@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;


    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody UsuarioDto usuarioDto){
        Usuario usuario = usuarioService.salvar(usuarioDto.trnsformaParaObjeto());
        return new ResponseEntity(UsuarioRespotaDto.transfomaemDto(usuario), HttpStatus.CREATED);
    }

}
