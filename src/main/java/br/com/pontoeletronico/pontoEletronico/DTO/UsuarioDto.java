package br.com.pontoeletronico.pontoEletronico.DTO;

import br.com.pontoeletronico.pontoEletronico.model.Usuario;
import lombok.Getter;

@Getter
public class UsuarioDto {

    private String nome;
    private String email;
    private String senha;

    public Usuario trnsformaParaObjeto(){
        return new Usuario(this.nome, this.email, this.senha);
    }


}
