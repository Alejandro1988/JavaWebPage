package com.pagina.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CervezaLevaduraEntityPK implements Serializable {
	private int idCerveza;
	private int idLevadura;

	@Column(name = "idCerveza", nullable = false)
	@Id
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Column(name = "idLevadura", nullable = false)
	@Id
	public int getIdLevadura() {
		return idLevadura;
	}

	public void setIdLevadura(int idLevadura) {
		this.idLevadura = idLevadura;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaLevaduraEntityPK that = (CervezaLevaduraEntityPK) o;
		return idCerveza == that.idCerveza &&
				idLevadura == that.idLevadura;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idLevadura);
	}
}
