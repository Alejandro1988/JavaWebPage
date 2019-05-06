package com.pagina.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lupulo", schema = "pagina", catalog = "")
public class LupuloEntity {
	private int id;
	private String nombre;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LupuloEntity that = (LupuloEntity) o;
		return id == that.id &&
				Objects.equals(nombre, that.nombre);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre);
	}
}
