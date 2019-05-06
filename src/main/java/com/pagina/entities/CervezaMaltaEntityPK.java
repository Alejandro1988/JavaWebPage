package com.pagina.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CervezaMaltaEntityPK implements Serializable {
	private int idCerveza;
	private int idMalta;

	@Column(name = "idCerveza", nullable = false)
	@Id
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Column(name = "idMalta", nullable = false)
	@Id
	public int getIdMalta() {
		return idMalta;
	}

	public void setIdMalta(int idMalta) {
		this.idMalta = idMalta;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaMaltaEntityPK that = (CervezaMaltaEntityPK) o;
		return idCerveza == that.idCerveza &&
				idMalta == that.idMalta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idMalta);
	}
}
