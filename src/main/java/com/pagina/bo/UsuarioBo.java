package com.pagina.bo;

import com.pagina.model.UsuarioEntity;

import java.util.List;

public interface UsuarioBo {

	void addUsuario(UsuarioEntity usuario);

	List<UsuarioEntity> getAll();
}