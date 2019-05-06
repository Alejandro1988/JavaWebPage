package com.pagina.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cerveza_levadura", schema = "pagina", catalog = "")
@IdClass(CervezaLevaduraEntityPK.class)
public class CervezaLevaduraEntity {
	private int idCerveza;
	private int idLevadura;
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
	@Column(name = "idLevadura", nullable = false)
	public int getIdLevadura() {
		return idLevadura;
	}

	public void setIdLevadura(int idLevadura) {
		this.idLevadura = idLevadura;
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
		CervezaLevaduraEntity that = (CervezaLevaduraEntity) o;
		return idCerveza == that.idCerveza &&
				idLevadura == that.idLevadura &&
				cantidad == that.cantidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idCerveza, idLevadura, cantidad);
	}
}
