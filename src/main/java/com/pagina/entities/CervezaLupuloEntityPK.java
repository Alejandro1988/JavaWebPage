package com.pagina.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CervezaLupuloEntityPK implements Serializable {
	private int idCerveza;
	private int idLupulo;

	@Column(name = "idCerveza", nullable = false)
	@Id
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Column(name = "idLupulo", nullable = false)
	@Id
	public int getIdLupulo() {
		return idLupulo;
	}

	public void setIdLupulo(int idLupulo) {
		this.idLupulo = idLupulo;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaLupuloEntityPK that = (CervezaLupuloEntityPK) o;
		return idCerveza == that.idCerveza &&
				idLupulo == that.idLupulo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idLupulo);
	}
}
