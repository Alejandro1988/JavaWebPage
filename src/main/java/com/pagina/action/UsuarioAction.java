package com.pagina.action;

import com.opensymphony.xwork2.ModelDriven;
import com.pagina.bo.UsuarioBo;
import com.pagina.model.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class UsuarioAction implements ModelDriven {
	private UsuarioEntity usuario = new UsuarioEntity();
	private List<UsuarioEntity> usuarioList = new ArrayList<>();
	private UsuarioBo usuarioBo;

	public String addUsuario() throws Exception{
		usuarioBo.addUsuario(usuario);
		usuarioList = null;
		usuarioList = usuarioBo.getAll();
		return "SUCCESS";
	}

	public String getAll() throws Exception {
		usuarioList = usuarioBo.getAll();
		return "SUCCESS";
	}

	public List<UsuarioEntity> getUsuarioList() {
		return usuarioList;
	}

	public void setUsuarioList(List<UsuarioEntity> usuarioList) {
		this.usuarioList = usuarioList;
	}

	public Object getModel() {
		return usuario;
	}

	public void setUsuarioBo(UsuarioBo usuarioBo) {
		this.usuarioBo = usuarioBo;
	}
}
