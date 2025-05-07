package me.dio.Decola.Tech._5.service;

import me.dio.Decola.Tech._5.domain.model.Usuario;
public interface ServiceUsuario {

    Usuario findById(Long id);

    Usuario create(Usuario criarUsuario);
}
