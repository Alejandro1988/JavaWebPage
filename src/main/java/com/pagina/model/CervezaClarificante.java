package com.pagina.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cerveza_clarificante", schema = "pagina", catalog = "")
@IdClass(CervezaClarificanteEntityPK.class)
public class CervezaClarificante {
	private int idCerveza;
	private int idClarificante;
	private int cantidad;

	@Id
	@Column(name = "idCerveza", nullable = false)
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Id
	@Column(name = "idClarificante", nullable = false)
	public int getIdClarificante() {
		return idClarificante;
	}

	public void setIdClarificante(int idClarificante) {
		this.idClarificante = idClarificante;
	}

	@Basic
	@Column(name = "cantidad", nullable = false)
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaClarificante that = (CervezaClarificante) o;
		return idCerveza == that.idCerveza &&
				idClarificante == that.idClarificante &&
				cantidad == that.cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idClarificante, cantidad);
	}
}
