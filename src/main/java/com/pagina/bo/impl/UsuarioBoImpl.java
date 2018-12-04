package com.pagina.bo.impl;

import com.pagina.bo.UsuarioBo;
import com.pagina.dao.UsuarioDAO;
import com.pagina.model.Usuario;

import java.util.List;

public class UsuarioBoImpl implements UsuarioBo {
	UsuarioDAO usuarioDAO;

	@Override
	public void addUsuario(Usuario usuario) {
		usuarioDAO.saveOrUpdate(usuario);
	}

	@Override
	public List<Usuario> getAll() {
		return usuarioDAO.getAll();
	}

	public void setUsuarioDAO (UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
}
