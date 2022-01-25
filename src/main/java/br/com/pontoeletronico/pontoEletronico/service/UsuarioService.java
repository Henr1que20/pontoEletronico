package br.com.pontoeletronico.pontoEletronico.service;

import br.com.pontoeletronico.pontoEletronico.model.Usuario;
import br.com.pontoeletronico.pontoEletronico.repositoey.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }


}
