package me.dio.Decola.Tech._5.service.impl;

import me.dio.Decola.Tech._5.domain.model.Usuario;
import me.dio.Decola.Tech._5.domain.repository.RepositorioUsuario;
import me.dio.Decola.Tech._5.service.ServiceUsuario;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class ImplServiceUsuario implements ServiceUsuario {

    private final RepositorioUsuario repositorioUsuario;

    public ImplServiceUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }
    @Override
    public Usuario findById(Long id) {
        return repositorioUsuario.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Usuario create(Usuario criarUsuario) {

        if (criarUsuario.getId() != null && repositorioUsuario.existsById(criarUsuario.getId())) {
            throw new IllegalArgumentException("Este usuário já existe.");
        }

        if (repositorioUsuario.numeroDaContaJaExiste(criarUsuario.getConta().getNumero())) {
            throw new IllegalArgumentException("Este número de conta já existe.");
        }
        return repositorioUsuario.save(criarUsuario);
    }
}
