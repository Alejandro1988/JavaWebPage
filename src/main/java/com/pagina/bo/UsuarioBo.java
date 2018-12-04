package com.pagina.bo;

import com.pagina.model.Usuario;

import java.util.List;

public interface UsuarioBo {

	void addUsuario(Usuario usuario);

	List<Usuario> getAll();
}