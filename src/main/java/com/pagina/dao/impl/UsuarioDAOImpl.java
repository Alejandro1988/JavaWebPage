package com.pagina.dao.impl;

import com.pagina.dao.UsuarioDAO;
import com.pagina.model.UsuarioEntity;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class UsuarioDAOImpl extends HibernateDaoSupport implements UsuarioDAO {
	@Override
	public void addusuario(UsuarioEntity usuario) {
		getHibernateTemplate().save(usuario);
	}

	@Override
	public List<UsuarioEntity> getAll() {
		return getHibernateTemplate().find("select nombre from UsuarioEntity");
	}
}
