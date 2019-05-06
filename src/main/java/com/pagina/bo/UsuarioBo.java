package com.pagina.bo;

import com.pagina.entities.Usuario;

import java.util.List;

public interface UsuarioBo {

	void addUsuario(Usuario usuario);

	List<Usuario> getAll();
}