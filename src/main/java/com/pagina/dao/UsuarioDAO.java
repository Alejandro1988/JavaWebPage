package com.pagina.dao;

import com.pagina.model.UsuarioEntity;

import java.util.List;

public interface UsuarioDAO {

	public void addusuario(UsuarioEntity usuario);

	public List getAll();
}