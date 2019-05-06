package com.pagina.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cerveza_lupulo", schema = "pagina", catalog = "")
@IdClass(CervezaLupuloEntityPK.class)
public class CervezaLupuloEntity {
	private int idCerveza;
	private int idLupulo;
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
	@Column(name = "idLupulo", nullable = false)
	public int getIdLupulo() {
		return idLupulo;
	}

	public void setIdLupulo(int idLupulo) {
		this.idLupulo = idLupulo;
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
		CervezaLupuloEntity that = (CervezaLupuloEntity) o;
		return idCerveza == that.idCerveza &&
				idLupulo == that.idLupulo &&
				cantidad == that.cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idLupulo, cantidad);
	}
}
