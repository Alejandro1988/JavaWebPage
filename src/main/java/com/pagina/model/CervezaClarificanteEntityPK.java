package com.pagina.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CervezaClarificanteEntityPK implements Serializable {
	private int idCerveza;
	private int idClarificante;

	@Column(name = "idCerveza", nullable = false)
	@Id
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Column(name = "idClarificante", nullable = false)
	@Id
	public int getIdClarificante() {
		return idClarificante;
	}

	public void setIdClarificante(int idClarificante) {
		this.idClarificante = idClarificante;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaClarificanteEntityPK that = (CervezaClarificanteEntityPK) o;
		return idCerveza == that.idCerveza &&
				idClarificante == that.idClarificante;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idClarificante);
	}
}
