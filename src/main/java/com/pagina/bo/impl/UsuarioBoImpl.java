package com.pagina.bo.impl;

import com.pagina.bo.UsuarioBo;
import com.pagina.dao.UsuarioDAO;
import com.pagina.model.UsuarioEntity;

import java.util.List;

public class UsuarioBoImpl implements UsuarioBo {
	UsuarioDAO usuarioDAO;

	@Override
	public void addUsuario(UsuarioEntity usuario) {
		usuarioDAO.addusuario(usuario);
	}

	@Override
	public List<UsuarioEntity> getAll() {
		return usuarioDAO.getAll();
	}

	public void setUsuarioDAO (UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
}
