package br.com.pontoeletronico.pontoEletronico.DTO;

import br.com.pontoeletronico.pontoEletronico.model.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRespotaDto {

    private Long is;
    private String nome;
    private String email;
    private boolean admin;

    public static UsuarioRespotaDto transfomaemDto(Usuario usuario){
        return new UsuarioRespotaDto(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.isAdmin());
    }
}
