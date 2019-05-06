package com.pagina.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "cerveza_malta", schema = "pagina", catalog = "")
@IdClass(CervezaMaltaEntityPK.class)
public class CervezaMaltaEntity {
	private int idCerveza;
	private int idMalta;
	private BigDecimal cantidad;

	@Id
	@Column(name = "idCerveza", nullable = false)
	public int getIdCerveza() {
		return idCerveza;
	}

	public void setIdCerveza(int idCerveza) {
		this.idCerveza = idCerveza;
	}

	@Id
	@Column(name = "idMalta", nullable = false)
	public int getIdMalta() {
		return idMalta;
	}

	public void setIdMalta(int idMalta) {
		this.idMalta = idMalta;
	}

	@Basic
	@Column(name = "cantidad", nullable = false, precision = 2)
	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		CervezaMaltaEntity that = (CervezaMaltaEntity) o;
		return idCerveza == that.idCerveza &&
				idMalta == that.idMalta &&
				Objects.equals(cantidad, that.cantidad);
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idMalta, cantidad);
	}
}
